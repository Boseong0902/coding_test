package sec111.mine;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] c_list = in.nextLine().toCharArray();
        char prev;
        int cnt = 0;
        prev = c_list[0];

        for(int i = 0; i<c_list.length; i++){
            if(i == c_list.length-1){
                if(c_list[i] == prev){
                    cnt++;
                    System.out.print(c_list[i]);
                    System.out.print(cnt);
                }
                else{
                    System.out.print(c_list[i-1]);
                    if(cnt != 1){
                        System.out.print(cnt);
                    }
                    System.out.print(c_list[i]);
                }

            }
            else if(c_list[i] == prev){
                cnt++;
            }
            else{
                System.out.print(prev);
                if(cnt != 1 && cnt != 0){
                    System.out.print(cnt);
                }
                prev = c_list[i];
                cnt = 1;
            }
        }
    }
}