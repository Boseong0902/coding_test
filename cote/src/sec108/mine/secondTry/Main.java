package sec108.mine.secondTry;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long startTime = 0;
        long endTime = 0;
        startTime = System.nanoTime();

        char[] str = in.nextLine().toCharArray();
        int Lp = 0;
        int Rp = str.length - 1;
        boolean flag = true;

        while(Lp < Rp){
            if(!Character.isAlphabetic(str[Lp])){
                Lp++;
            }
            else if(!Character.isAlphabetic(str[Rp])){
                Rp--;
            }
            else{
                char leftChar = Character.toLowerCase(str[Lp]);
                char rightChar = Character.toLowerCase(str[Rp]);
                if(leftChar != rightChar){
                    flag = false;
                    break;
                }
                Lp++;
                Rp--;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime));
    }
}