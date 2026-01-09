package sec105.firstTry;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] ch = input.toCharArray();
        Deque<Character> char_stack = new ArrayDeque<>();
        Deque<Character> unchar_queue = new ArrayDeque<>();
        for(char c : ch){
            if(Character.isLetter(c)){
                char_stack.addFirst(c);
            }
            else{
                unchar_queue.addLast(c);
                char_stack.addFirst('.');
            }
        }
//        for(int i = 0; i < ch.length; i++){
//            System.out.print(char_stack.pollFirst());
//        }
        for(int i =0 ;i<ch.length;i++){
            char c = char_stack.pollFirst();
            if(c != '.'){
                System.out.print(c);
            }
            else{
                System.out.print(unchar_queue.pollFirst());
            }
        }
    }
}
// 처음 char_stack에 넣을 때, 문자면 문자 그대로, 기호면 . 을 넣고,
// 실제 기호는 unchar_queue에 넣는다
// 이를 char_stack을 출력할 때, 문자이면 그냥 출력, 기호이면 unchar_queue에서 가져와서 출력하는 형식으로 출력
// 문제점 : 문자 사이사이에 있는 기호의 경우엔 순서가 안바뀌는데, 가장 처음이나 끝에 기호가 오면 순서가 바뀜 ex> #abc -> cba#
// 그래서 이번엔 문자를 따로 관리해볼거다 [#a%a!a&a] 이런식으로, 그리고 a가 나오면 문자 스택에서 뽑아쓰는거지