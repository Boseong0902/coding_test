package test;

import java.util.*;

public class main{
    public static void main(String[] args){
        Set<String> hset = new HashSet<>();

        hset.add("1");
        hset.add("2");
        hset.add("3");

        for(String i:hset){
            System.out.print(i);
//            if(i == "1"){
//                System.out.remove(i);
//            }
        }
        System.out.println();

        Iterator<String> it = hset.iterator();
        while(it.hasNext()){
            String val = it.next();
            System.out.print(val);
            if(val=="1"){
                it.remove();
            }
        }
        System.out.println();
        System.out.print(hset);
    }
}