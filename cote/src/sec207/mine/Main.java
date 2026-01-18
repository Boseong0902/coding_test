package sec207.mine;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int score = 1;
        int culScore = 0;
        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            if(j == 0){
                score = 1;
            }
            else{
                culScore += score++;
            }
        }
        System.out.println(culScore);
    }
}