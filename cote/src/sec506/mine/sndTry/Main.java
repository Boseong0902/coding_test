package sec506.mine.sndTry;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 1; i <= n; i++){
            queue.offerLast(i);
        }

        int leftPrinces = n;
        int isHeFall = 1;

        while(leftPrinces>1){
            while(isHeFall<=m){
                if(isHeFall==m){
                    int k = queue.pollFirst();
                    leftPrinces--;
                    isHeFall=1;
                    break;
                }
                queue.offerLast(queue.pollFirst());
                isHeFall++;
            }
        }
        System.out.print(queue.pollFirst());
    }
}