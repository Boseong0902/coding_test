package sec113.mine;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        System.out.print(prev+" ");
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            if(a>prev){
                System.out.print(a+" ");
            }
            prev = a;
        }
    }
}