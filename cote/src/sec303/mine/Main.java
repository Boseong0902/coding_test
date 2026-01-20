package sec303.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int window = 0;
        int max = 0;
        int startWindow = 0;
        int endWindow = m-1;

        int [] list = new int[n];

        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            window += list[i];
        }

        max = window;
        while(endWindow<n-1){
            endWindow++;
            window -=  list[startWindow];
            window += list[endWindow];
            startWindow++;
            if(max<window){
                max=window;
            }
        }
        System.out.println(max);

    }
}