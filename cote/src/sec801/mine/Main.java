package sec801.mine;

import java.util.*;
public class Main{
    static int[] arr;
    static int halfSum = 0;
    static boolean flag;
    static void dfs(int layer, int sum){
        if(flag||sum>halfSum||layer==arr.length){
            return;
        }
        else if(sum == halfSum){
            flag = true;
            return;
        }
        int k = arr[layer];
        dfs(layer+1, sum);
        dfs(layer+1,sum+k);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i<n; i++){
            int k = sc.nextInt();
            arr[i] = k;
            sum+=k;
        }
        if(sum%2==0){
            halfSum = sum/2;
            dfs(0, 0);
            if(flag){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else{
            System.out.print("NO");
        }

    }
}