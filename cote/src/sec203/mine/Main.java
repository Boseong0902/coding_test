package sec203.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            a.offerLast(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            b.offerLast(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            int whoWin = a.pollFirst() - b.pollFirst();
            if(whoWin == 1){
                System.out.println('A');
            }
            else if(whoWin == -1){
                System.out.println('B');
            }
            else if(whoWin == 2){
                System.out.println('B');
            }
            else if(whoWin == -2){
                System.out.println('A');
            }
            else if(whoWin == 0){
                System.out.println('D');
            }
        }
    }
}