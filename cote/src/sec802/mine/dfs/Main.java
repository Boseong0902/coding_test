package sec802.mine.dfs;

import java.util.*;
public class Main{
    static int max = 0;
    static int limit = 0;
    static int n = 0;
    static int[] dogs;
    static void dfs(int cnt, int sum){
        if(cnt==n){
            if(sum <= limit && sum>max){
                max = sum;
            }
            return;
        }
        dfs(cnt+1, sum);
        dfs(cnt+1, sum+dogs[cnt]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        n = sc.nextInt();
        dogs = new int[n];
        for(int i = 0; i<n; i++){
            dogs[i] = sc.nextInt();
        }
        dfs(0,0);
        System.out.print(max);
    }
}