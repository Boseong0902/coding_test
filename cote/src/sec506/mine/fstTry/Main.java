package sec506.mine.fstTry;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        int leftPrinces = n;
        int isHeFall = 1;

        for(int i = 1; i <= n; i++){
            stack1.offerLast(i);
        }

        while(leftPrinces>1){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    if(isHeFall == m){
                        stack1.pollFirst();
                        leftPrinces--;
                        isHeFall = 1;
                        continue;
                    }
                    stack2.offerLast(stack1.pollFirst());
                    isHeFall++;
                }
            }
            else{
                while(!stack2.isEmpty()) {
                    if (isHeFall == m) {
                        stack2.pollFirst();
                        leftPrinces--;
                        isHeFall = 1;
                        continue;
                    }
                    stack1.offerLast(stack2.pollFirst());
                    isHeFall++;
                }
            }
        }
        if(stack2.isEmpty()){
            System.out.print(stack1.pollLast());
        }
        else{
            System.out.print(stack2.pollLast());
        }

    }
}

// 뭐 잘 풀리긴 했는데, 생각해보니까 그냥 큐 하나가지고 계속 원형으로 돌리면 되잖아 -> sndTry에서 구현