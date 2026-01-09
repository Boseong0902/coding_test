package sec106.mine;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Character>  set = new HashSet<>();
        for(char c : sc.nextLine().toCharArray()){
            if(set.contains(c)){
                continue;
            }
            set.add(c);
            System.out.print(c);
        }
    }
}