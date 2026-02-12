package sec803.mine;

import java.util.*;
public class Main{
    static int max = 0;
    static int limit = 0;
    static int[] score;
    static int[] time;
    static void dfs(int cnt, int sumScore, int sumTime){
        if(cnt==score.length){
            if(sumTime<=limit){
                if(sumScore>max){
                    max = sumScore;
                }
            }
            return;
        }
        dfs(cnt+1, sumScore, sumTime);
        dfs(cnt+1, sumScore+score[cnt], sumTime+time[cnt]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        score = new int[n];
        time = new int[n];

        limit = sc.nextInt();
        for(int i = 0; i<n; i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        dfs(0, 0, 0);

        System.out.print(max);
    }
}