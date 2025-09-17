package test;

import java.util.*;

public class main{
    public static void main(String[] args){
        Set<String> hset1 = new HashSet<>();

        hset1.add("1");
        hset1.add("2");
        hset1.add("3");
        hset1.add("1");
        System.out.println(hset1);

        Set<String> hset2 = new HashSet<>();
        hset2.add("1");
        hset2.add("2");
        hset2.add("3");

        hset1.addAll(hset2);

        System.out.println(hset1);
    }
}