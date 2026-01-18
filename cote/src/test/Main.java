package test;

import java.util.*;

public class Main{
    public static void main(String[] args){
        String a = "1234";
        char b[] = a.toCharArray();
        int c = 0;
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+" ");
            int d = Character.getNumericValue(b[i]);
            c+=(d*10);
            System.out.println(c);
        }

    }
}

//이렇게 수정해도 반영 안되는거지