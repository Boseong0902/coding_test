package sec507.mine;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] list =  sc.nextLine().toCharArray();
        char[] takeList = sc.nextLine().toCharArray();

        Set<Character> set = new HashSet<>();

        for(char c: list){
            set.add(c);
        }

        boolean flag = true;

        for(char c: list){
            int i = 0;
            while(i<takeList.length-1&&!set.contains(takeList[i])){
                i++;
            }
            if(takeList[i] != c){
                flag = false;
                break;
            }
            set.remove(takeList[i]);
        }
        if(flag){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}