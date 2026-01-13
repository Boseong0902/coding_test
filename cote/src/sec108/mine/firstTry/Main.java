package sec108.mine.firstTry;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long startTime = 0;
        long endTime = 0;
        startTime = System.nanoTime();

        String s = sc.nextLine();
        Deque<Character> list = new ArrayDeque<>();
        s = s.toLowerCase();
        boolean tf_val = true;
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                list.addLast(c);
            }
        }
        while(list.size() > 1){
            if(list.pollFirst() == list.pollLast()){
                continue;
            }
            tf_val = false;
        }
        if(tf_val){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime));
    }
}