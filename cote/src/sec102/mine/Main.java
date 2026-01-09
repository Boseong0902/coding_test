package sec102.mine;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        Deque<Character> char_list = new ArrayDeque<>();
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                c =  Character.toLowerCase(c);
            }
            else{
                c =  Character.toUpperCase(c);
            }
            char_list.add(c);
        }
        for(char c:char_list){
            System.out.print(c);
        }
    }
}
