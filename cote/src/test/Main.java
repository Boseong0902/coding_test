package test;

import java.util.*;

public class Main{
    public static int solution(String s, char c){
        int num = 0;
        s = s.toLowerCase();
        c = Character.toLowerCase(c);

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        String str1 = in.next();
        char str2 = in.next().charAt(0);

        System.out.println(solution(str1,str2));
    }
}