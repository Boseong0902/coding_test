package sec609.mine;

import java.util.*;

public class Main{
    static boolean check(int[]arr, int arg, int m){
        int cnt = 1;
        int siz = arg;
        for(int i:arr){
            if(siz>=i){
                siz-=i;
            }
            else{
                cnt++;
                siz = arg-i;
            }
        }
        if(cnt<=m){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = 0;
        int end = 0;
        int answer = 0;
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            int k = sc.nextInt();
            arr[i] = k;
            end += k;
            if(k>start){
                start = k;
            }
        }

        while(start<end){
            int checkIdx = (start+end)/2;
            if(check(arr, checkIdx, m)){
                end = checkIdx-1;
                answer = checkIdx;
            }
            else{
                start = checkIdx+1;
            }
        }
        System.out.println(answer);
    }
}