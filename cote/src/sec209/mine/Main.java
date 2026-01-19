package sec209.mine;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] list = new int[2*n+2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int k =  sc.nextInt();
                if(i==j){ // 좌상 -> 우하 대각선
                    list[0]+= k;
                }
                if(i+j==k-1){ // 우상 -> 좌하 대각선
                    list[1]+= k;
                }
                list[2+i]+=k;
                list[2+n+j]+=k;
            }
        }
        int max = 0;
        for(int i : list){
            if(i>max){
                max = i;
            }
        }
        System.out.print(max);
    }
}
// 각 숫자들을 읽음과 동시에 그 숫자가 속할 수 있는 리스트의 합을 저장하는 곳에 합산해줌
//      ####################
//      #  5               #
//      #  10 13 10 12 15  #
//      #  12 39 30 23 11  #
//      #  11 25 50 53 15  #
//      #  19 27 29 37 27  #
//      #  19 13 30 13 19  #
//      ####################
// 위 예시의 경우, 39([1][1])을 읽어들임과 동시에, 39가 속하는 가로줄, 세로줄, 대각선줄에 합산함.
// list[0] : 좌상 -> 우하
// list[1] : 우상 -> 좌하
// list[2~6] : 1번째 가로줄 ~ 5번째 가로줄
// list[7~11] : 1번째 세로줄 ~ 5번째 세로줄