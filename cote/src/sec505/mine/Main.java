package sec505.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list = sc.nextLine().toCharArray();
        Deque<Character>stack = new ArrayDeque<>();
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i<list.length; i++){
            if(list[i] == '('){
                stack.offerLast(list[i]);
                cnt++;
            }
            else{
                if(list[i-1]==')'){
                    cnt--;
                    sum++;
                    stack.pollLast();
                }
                else{
                    cnt--;
                    sum+=cnt;
                }
            }
        }
        System.out.println(sum);
    }
}