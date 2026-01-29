package sec601.mine;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            int min = 100;
            int minIdx = 0;
            for(int j = i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}