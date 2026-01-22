package sec501.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list = sc.nextLine().toCharArray();
        boolean flag = true;

        Deque<Character> stack = new ArrayDeque<>();

        for(char c: list){
            if(c == '('){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    flag = false;
                    break;
                }
            }
        }
        if(flag&&stack.isEmpty()){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}