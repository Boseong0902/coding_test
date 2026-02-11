package sec708.mine.wrong;

import java.util.*;

public class Main{
    static int dept = 0;
    static int cow = 0;
    static boolean flag = true;
    static void bfs(int loc){
        if(!flag){
            return;
        }
        dept++;
        if(loc == cow){
            flag = false;
            return;
        }
        else{
            bfs(loc+1);
            bfs(loc-1);
            bfs(loc+5);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cow = sc.nextInt();

        bfs(n);

        System.out.println(dept);
    }
}