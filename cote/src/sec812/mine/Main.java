package sec812.mine;

import java.util.*;
public class Main{
    static Deque<int[]> q = new ArrayDeque<>();
    static int zero = 0;

    static int bfs(int[][]tomato){
        int day = 0;
        while(!q.isEmpty()){
            if(zero == 0){
                return day;
            }
            int sz = q.size();
            for(int i = 0; i<sz; i++){
                int[] tmp = q.pollLast();
                int x = tmp[0];
                int y = tmp[1];

                if(tomato[x-1][y]==0){
                    int[] put = {x-1,y};
                    tomato[x-1][y]=1;
                    q.offerFirst(put);
                    zero--;
                }
                if(tomato[x+1][y]==0){
                    int[] put = {x+1,y};
                    tomato[x+1][y]=1;
                    q.offerFirst(put);
                    zero--;
                }
                if(tomato[x][y-1]==0){
                    int[] put = {x,y-1};
                    tomato[x][y-1]=1;
                    q.offerFirst(put);
                    zero--;
                }
                if(tomato[x][y+1]==0){
                    int[] put = {x,y+1};
                    tomato[x][y+1]=1;
                    q.offerFirst(put);
                    zero--;
                }
            }
            day++;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]tomato = new int[n+2][m+2];
        for(int i = 0; i<m+2; i++){
            for(int j = 0; j<n+2; j++){
                tomato[j][i] = 3;
            }
        }
        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<n+1; j++){
                int k = sc.nextInt();
                tomato[j][i] = k;
                if(k==0){
                    zero++;
                }
                if(k==1){
                    int[] put = {j,i};
                    q.offerLast(put);
                }
            }
        }
        System.out.println(bfs(tomato));
    }
}