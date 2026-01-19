package sec209.mine;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] list = new int[2*n+2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int k =  sc.nextInt();
                if(i==j){ // 좌상 -> 우하 대각선
                    list[0]+= k;
                }
                if(i+j==k-1){ // 우상 -> 좌하 대각선
                    list[1]+= k;
                }
                list[2+i]+=k;
                list[2+n+j]+=k;
            }
        }
        int max = 0;
        for(int i : list){
            if(i>max){
                max = i;
            }
        }
        System.out.print(max);
    }
}