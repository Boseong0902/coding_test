package sec109.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> queue = new ArrayDeque<>();
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)||(queue.isEmpty()&&c=='0')){
                continue;
            }
            queue.addLast(c);
        }
        while(!queue.isEmpty()){
            System.out.print(queue.removeFirst());
        }
    }
}