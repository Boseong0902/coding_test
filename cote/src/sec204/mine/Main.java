package sec204.mine;

import java.util.*;
public class Main{
    static void fib(int n, int m, int it){
        int k = n+m;
        if(it != 0){
            System.out.print(k + " ");
        }
        else{
            return;
        }
        it--;
        fib(m, k, it);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        fib(a,b,n-2);

    }
}