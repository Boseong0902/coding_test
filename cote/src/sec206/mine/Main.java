package sec206.mine;

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
            String j = sc.next();
            char[] jList = j.toCharArray();
            int answer = 0;
            int mulIdx = 1;
            boolean idxZero = true;
            for(char c : jList){
                int d =  Character.getNumericValue(c);
                if(idxZero){
                    if(d==0){
                        continue;
                    }
                    else{
                        answer += mulIdx*d;
                        mulIdx = mulIdx*10;
                        idxZero = false;
                    }
                }
                else{
                    answer += mulIdx*d;
                    mulIdx = mulIdx*10;
                }
            }
            if(checkList[answer]==2){
                System.out.print(answer+" ");
            }
        }
    }
}

// 뒤집은 숫자 구하기 -> String으로 받아서 toCharArray로 char[]바꾸고, 각각을 Character.getNumericValue()사용해서 각 자리수에 대해 접근함
// 에라토스테네스의 채로 소수 체크 리스트 구현해놓고, 각 숫자들을 뒤집은 숫자들을 구한 후, 체크리스트에서 체크