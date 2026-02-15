// 전략
// 각 피자집들의 포함 여부를 dfs(재귀함수)를 사용하여 모든 경우의 수를 따진다. -> 각 피자집들의 포함 여부를 반영한 전체 지도 완성
//      근데 여기서 combination을 고려해야될 듯. n개의 피자집 중 r개를 뽑는 모든 경우를 탐색하는거니까
// 각 리프루프에서 bfs(큐 사용)하여 도시의 최소 피자집 거리를 구한다
// static변수로 min선언하고, 각 루프마다 최소값 갱신여부 확인 후 갱신 수행
// 모든 재귀 루프가 끝나면 min값 반환

// min - 전역
// 큐 - 지역(매개변수로 전달)

package sec814.mine;

import java.util.*;
public class Main{
    static int min = 1000;
    static int originMaps[][];
    static void bfs(Deque<int[]> house, int maps[][]){
        int sum = 0;
        int dist = 0;
        while(!house.isEmpty()){
            int[] tmp = house.pollFirst();
            int x = tmp[0];
            int y = tmp[1];
            if(maps[x][y] == 2){
                sum+=dist;
            }
            else{
                if(maps[x-1][y]==0){
                    int put[] = {x-1,y};
                    house.offerLast(put);
                }
                if(maps[x+1][y]==0){
                    int put[] = {x+1,y};
                    house.offerLast(put);
                }
                if(maps[x][y-1]==0){
                    int put[] = {x,y-1};
                    house.offerLast(put);
                }
                if(maps[x][y+1]==0){
                    int put[] = {x,y+1};
                    house.offerLast(put);
                }
            }
            dist++;
        }
        if(sum < min){
            min = sum;
        }
    }

    static void dfs(){

    }
    public static void main(String[] args){

    }
}