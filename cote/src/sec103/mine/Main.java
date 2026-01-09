package sec103.mine;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int max = 0;
        String answer=null;
        for(String s:in.nextLine().split(" ")){
            if(s.length()>max){
                max=s.length();
                answer=s;
            }
        }
        System.out.println(answer);
    }
}