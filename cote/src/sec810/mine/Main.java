package sec810.mine;

import java.util.*;
public class Main{
    static int[][]miro = new int[9][9];
    static int cnt = 0;
    static void dfs(int[]pos){
        int x = pos[0];
        int y = pos[1];
        if(x==7&&y==7){
            cnt++;
            return;
        }
        if(miro[x-1][y]==1&&miro[x+1][y]==1&&miro[x][y-1]==1&&miro[x][y+1]==1){
            return;
        }
        miro[x][y] = 1;
        if(miro[x-1][y]==0){
            int[] put = {x-1,y};
            dfs(put);
        }
        if(miro[x+1][y]==0){
            int[] put = {x+1,y};
            dfs(put);
        }
        if(miro[x][y-1]==0){
            int[] put = {x,y-1};
            dfs(put);
        }
        if(miro[x][y+1]==0){
            int[] put = {x,y+1};
            dfs(put);
        }
        miro[x][y]=0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                miro[i][j] = 1;
            }
        }
        for(int i = 1; i<8;i++){
            for(int j = 1; j<8;j++){
                miro[j][i] = sc.nextInt();
            }
        }
        int[] init = {1,1};
        dfs(init);
        System.out.print(cnt);
    }
}