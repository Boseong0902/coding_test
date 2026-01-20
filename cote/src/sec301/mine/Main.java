package sec301.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> aList = new ArrayDeque<>();
        Deque<Integer> bList = new ArrayDeque<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            aList.offerLast(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            bList.offerLast(sc.nextInt());
        }
        while(!aList.isEmpty() && !bList.isEmpty()) {
            if(aList.peekFirst()>bList.peekFirst()){
                System.out.print(bList.pollFirst()+" ");
            }
            else{
                System.out.print(aList.pollFirst()+" ");
            }
        }
        while(!aList.isEmpty()){
            System.out.print(aList.pollFirst()+" ");
        }
        while(!bList.isEmpty()){
            System.out.print(bList.pollFirst()+" ");
        }
    }
}