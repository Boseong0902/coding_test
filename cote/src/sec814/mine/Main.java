// 전략
// 각 피자집들의 포함 여부를 dfs(재귀함수)를 사용하여 모든 경우의 수를 따진다. -> 각 피자집들의 포함 여부를 반영한 전체 지도 완성
//      근데 여기서 dfs를 combination으로 구현하는걸 고려해야될 듯. n개의 피자집 중 r개를 뽑는 모든 경우를 탐색하는거니까
// 각 리프루프에서 bfs(큐 사용)하여 도시의 최소 피자집 거리를 구한다
// static변수로 min선언하고, 각 루프마다 최소값 갱신여부 확인 후 갱신 수행
// 모든 재귀 루프가 끝나면 min값 반환

// min - 전역
// 큐 - 지역(매개변수로 전달)

package sec814.mine;

import java.util.*;
public class Main{
    static int n;
    static int min = 1000;
    static int originMaps[][];
    static int[] pizzaLoc[];
    static int houseLoc[][];
    static int limit; // 제외될 피자 집 개수

    static void bfs(Deque<int[]> house, int[][]maps){
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
    static void dfs(int currentCnt, int[] deadPizza[], int idx){
        if(currentCnt==limit){
            Deque<int[]> house = new ArrayDeque<>();
            int[][] copyMaps = new int[n][n];

            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    copyMaps[j][i] = originMaps[j][i];
                    if(originMaps[j][i] == 1){
                        int[]put = {j,i};
                        house.offerLast(put);
                    }
                }
            }
            for(int i = 0; i<deadPizza.length; i++){
                int x = deadPizza[i][0];
                int y = deadPizza[i][1];
                copyMaps[x][y] = 3;
            }
            bfs(house, copyMaps);
            return;
        }
        deadPizza[currentCnt] = pizzaLoc[idx];
        for(int i = 0; i<pizzaLoc.length; i++){
            dfs(currentCnt+1, deadPizza, idx+1+i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int pizzaCnt = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                int k  = sc.nextInt();
                originMaps[j][i] = k;
                if(k == 2){
                    pizzaCnt++;
                }
            }
        }
        limit = pizzaCnt-m;
        int[] deadPizza[] = new int[limit][2];
        for(int i = 0; i<pizzaLoc.length; i++){
            dfs(0, deadPizza, i);
        }

        System.out.print(min);
    }
}