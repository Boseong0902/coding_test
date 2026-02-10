package sec610.mine;

import java.util.*;

public class Main{
    static boolean check(int[] arr, int cnt, int dist){
        cnt--;
        int lt = 0;
        int rt = 1;

        while(cnt > 0 && rt < arr.length){
            if(arr[rt] - arr[lt]>=dist){
                cnt--;
                if(cnt==0){
                    return true;
                }
                lt = rt++;
            }
            else{
                if(rt == arr.length-1){
                    return false;
                }
                rt++;
            }
        }
        if(cnt==0){
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
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 1;
        int end = arr[n-1];
        int answer = 0;

        while(start<end){
            int checkIdx = (start+end)/2;
            if(check(arr, m, checkIdx)){
                start = checkIdx+1;
                answer = checkIdx;
            }
            else{
                end = checkIdx-1;
            }
        }
        System.out.println(answer);
    }
}