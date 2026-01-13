package sec105.answer;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] str = in.nextLine().toCharArray();
        int Lp = 0;
        int Rp = str.length-1;
        while(Lp<Rp){
            if(!Character.isAlphabetic(str[Lp])){
                Lp++;
            }
            else if(!Character.isAlphabetic(str[Rp])){
                Rp--;
            }
            else{
                char temp = str[Lp];
                str[Lp] = str[Rp];
                str[Rp] = temp;
                Lp++;
                Rp--;
            }
        }
        String answer = String.valueOf(str);
        System.out.println(answer);
    }
}