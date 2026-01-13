package sec104.answer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Deque<Character> text =  new ArrayDeque<>();
        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            String str = new StringBuilder(in.next().toString()).reverse().toString();
//            char[] ch = str.toCharArray();
//            for(char c : ch){
//                text.offerFirst(c);
//            }
//            for(char c : text){
//                System.out.print(text.pop());
//            }
//            System.out.println();
//      이렇게 하나하나 다 뒤집어서 안넣어도 StringBuilder클래스 객체를 사용하면, 문자열을 객체 내에서 변경하는 메서드들이 지원됨
            System.out.println(str);
        }
    }
}