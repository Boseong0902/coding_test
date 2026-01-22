package sec504.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] list =  sc.nextLine().toCharArray();
        Deque<Integer> stack=new ArrayDeque<>();

        for(char c : list){
            if(Character.isDigit(c)){
                stack.offerLast(Character.getNumericValue(c));
            }
            else{
                int num2 = stack.pollLast();
                int num1 = stack.pollLast();
                if(c=='+'){
                    int num =  num1+num2;
                    stack.offerLast(num);
                }
                else if(c=='-'){
                    int num =  num1-num2;
                    stack.offerLast(num);
                }
                else if(c=='*'){
                    int num =  num1*num2;
                    stack.offerLast(num);
                }
                else if(c=='/'){
                    int num =  num1/num2;
                    stack.offerLast(num);
                }
            }
        }
        System.out.println(stack.pollLast());
    }
}