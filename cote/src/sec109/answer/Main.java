package sec109.answer;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer=0;
        for(char c : sc.next().toCharArray()){
            if(Character.isDigit(c)){
                answer=answer*10+Character.getNumericValue(c);
            }
        }
        System.out.println(answer);
    }
}