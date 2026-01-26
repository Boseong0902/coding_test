package sec508.mine;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Deque<Map<Integer,Integer>> queue = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            queue.offerLast(new HashMap<>());
        }
    }
}
