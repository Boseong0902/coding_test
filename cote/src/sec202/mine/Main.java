package sec202.mine;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        int cnt = 1;
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            if(a>max){
                cnt++;
                max=a;
            }
        }
        System.out.println(cnt);
    }
}