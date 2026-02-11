package sec811.mine;

import java.util.*;
public class Main{
    static int bfs(int[][] miro){
        int loc[] = {0,0};
        miro[0][0]=1;
        Deque<int[]>q = new ArrayDeque<>();
        q.offerLast(loc);
        int cnt = 0;

        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0; i<sz; i++){
                int[] tmp = q.pollFirst();
                int x = tmp[0];
                int y = tmp[1];
                if(x==6 && y==6){
                    return cnt;
                }
                if(x-1>=0 && y>=0 && miro[x-1][y]!=1){
                    int[]up = {x-1,y};
                    miro[x-1][y] = 1;
                    q.offerLast(up);
                }
                if(x+1<=6 && y>=0 && miro[x+1][y]!=1){
                    int[]down = {x+1,y};
                    miro[x+1][y] = 1;
                    q.offerLast(down);
                }
                if(x>=0 && y-1>=0 && miro[x][y-1]!=1){
                    int[]left = {x,y-1};
                    miro[x][y-1] = 1;
                    q.offerLast(left);
                }
                if(x>=0 && y+1<=6 && miro[x][y+1]!=1){
                    int[]right = {x, y+1};
                    miro[x][y+1] = 1;
                    q.offerLast(right);
                }
            }
            cnt++;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] miro = new int[7][7];
        for(int i = 0; i<7; i++){
            for(int j = 0; j<7; j++){
                miro[i][j] = sc.nextInt();
            }
        }
        System.out.print(bfs(miro));
    }
}