package sec210.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] list = new int[n+2][n+2];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                list[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(list[i][j]>list[i-1][j]&&
                list[i][j]>list[i+1][j]&&
                list[i][j]>list[i][j-1]&&
                list[i][j]>list[i][j+1]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}