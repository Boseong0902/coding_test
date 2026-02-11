package sec608.mine;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            int idx = i;
            while(idx>0){
                if(arr[idx] < arr[idx-1]){
                    int tmp =  arr[idx];
                    arr[idx] = arr[idx-1];
                    arr[idx-1] = tmp;
                    idx--;
                }
                else{
                    break;
                }
            }
        }
        int start = 0;
        int end = n;

        int idx = 0;
        while(true){
            idx = (start+end)/2;
            if(arr[idx]==m){
                break;
            }
            else if(arr[idx] < m){
                start = idx+1;
            }
            else{
                end = idx-1;
            }
        }
        System.out.println(idx+1);
    }
}