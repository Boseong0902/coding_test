package sec502.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list =  sc.nextLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<list.length;i++){
            if(Character.isLetter(list[i])){
                if(stack.isEmpty()){
                    System.out.print(list[i]);
                }
            }
            else{
                if(list[i]=='('){
                    stack.push(list[i]);
                }
                else if(list[i]==')'){
                    stack.pop();
                }
            }
        }
    }
}