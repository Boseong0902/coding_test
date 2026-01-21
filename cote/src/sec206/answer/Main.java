package sec206.answer;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int listSize = 100000;
        int [] checkList = new int[listSize];

        for(int i = 2; i<listSize; i++){
            if(checkList[i]==0){
                checkList[i] = 2;
                for(int j = 2*i; j<listSize; j = j+i){
                    checkList[j] = 1;
                }
            }
        }

        for(int i = 0; i<n; i++){
            int tmp = sc.nextInt();
            int num = 0;

            while(tmp>0){
                int t = tmp%10;
                num = num*10+t;
                tmp = tmp/10;
            }

            if(checkList[num]==2){
                System.out.print(num+" ");
            }
        }
    }
}
