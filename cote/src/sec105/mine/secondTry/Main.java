package sec105.mine.secondTry;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] ch = input.toCharArray();
        Deque<Character> char_stack = new ArrayDeque<>();
        Queue<Character> unchar_queue = new ArrayDeque<>();
        for(char c : ch){
            if(Character.isLetter(c)){
                unchar_queue.add('a');
                char_stack.addLast(c);
            }
            else{
                unchar_queue.add(c);
            }
        }
//        for(int i = 0; i < ch.length; i++){
//            System.out.print(char_stack.pollFirst());
//        }
        for(int i =0 ;i<ch.length;i++){
            char c = unchar_queue.poll();
            if(c != 'a'){
                System.out.print(c);
            }
            else{
                System.out.print(char_stack.pollLast());
            }
        }
    }
}