package sec107;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> wordStack = new ArrayDeque<>();
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean sign = true;
        for(int i = 0; i < s.length(); i++){
            wordStack.addLast(s.charAt(i));
        }
        for(int i = 0; i < s.length()/2; i++){
            if(wordStack.pollFirst() != wordStack.pollLast()){
                System.out.print("NO");
                sign = false;
                break;
            }
        }
        if (sign == true){
            System.out.println("YES");
        }

    }
}