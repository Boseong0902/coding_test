package sec304.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int startSum =0;
        int endSum =0;
        int sum = 0;
        int cnt = 0;

        int [] list = new int[n+1];
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }

        sum = list[0];
        if(sum==m){
            cnt++;
            sum=0;
        }

        while(list[endSum]!=0){
            if(sum>m){
                sum-=list[startSum++];
            }
            else if(sum==m){
                sum-=list[startSum++];
                cnt++;
                sum+=list[++endSum];
            }
            else{
                sum+=list[++endSum];
            }
        }

        System.out.println(cnt);
    }
}