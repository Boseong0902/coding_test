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
        long startTime;
        long endTime;

        // 재귀 사용
        int n = sc.nextInt();
        startTime = System.nanoTime();
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        fib(a,b,n-2);
        endTime = System.nanoTime();
        System.out.println("재귀: "+(endTime-startTime));

        //#######################################################
        // 단순 반복문 사용
        startTime = System.nanoTime();
        int c = 1, d = 1, e;
        System.out.print(c + " " + d + " ");
        for(int i = 2; i<n; i++){
            e = c+d;
            System.out.print(e+" ");
            c = d;
            d = e;
        }
        endTime = System.nanoTime();
        System.out.println("단순 반복문: "+(endTime-startTime));

    }
}