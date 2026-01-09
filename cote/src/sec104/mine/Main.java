package sec104.mine;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Deque<Character> text =  new ArrayDeque<>();
        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            String str = in.next();
            char[] ch = str.toCharArray();
            for(char c : ch){
                text.offerFirst(c);
            }
            for(char c : text){
                System.out.print(text.pop());
            }
            System.out.println();
        }
    }
}