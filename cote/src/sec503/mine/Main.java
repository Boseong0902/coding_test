package sec503.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        Deque<Integer>[] stack = new Deque[n];
        for(int i=0;i<n;i++){
            stack[i] = new LinkedList<>();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num = sc.nextInt();
                if(num!=0){
                    stack[j].offerFirst(num);
                }
            }
        }
        // 인형뽑기 완성


        int m = sc.nextInt();
        int cnt = 0;
        Deque<Integer> picked = new LinkedList<>();

        for(int i=0;i<m;i++){
            int pickWho = sc.nextInt()-1;
            if(stack[pickWho].isEmpty()){
                continue;
            }
            if(picked.isEmpty()){
                picked.offerLast(stack[pickWho].pollLast());
            }
            else{
                if(picked.peekLast()==stack[pickWho].peekLast()){
                    picked.pollLast();
                    stack[pickWho].pollLast();
                    cnt++;
                }
                else{
                    picked.offerLast(stack[pickWho].pollLast());
                }
            }
        }
        System.out.println(cnt*2);
    }
}