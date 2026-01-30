package sec606.mine;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);

        for(int i = 0; i < n; i++) {
            if(sorted[i] != arr[i]) {
                System.out.print((i+1) + " ");
                cnt ++;
                if(cnt==2){
                    break;
                }
            }
        }
    }
}