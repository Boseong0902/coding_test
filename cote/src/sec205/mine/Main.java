package sec205.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        int []check = new int[n+1];
        for(int i = 2; i<n+1; i++){
            if(check[i]==0){
                check[i]=1;
                answer++;
                    for(int j = i; j<n+1; j = j+i){
                    if(j%i==0){
                        check[j]=1;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

// 에라토스테네스의 채
// 여기서 for문 안에 있는 for문의 증가를 1씩 증가하도록, 즉 for(int j = i; j<n+1; j++)로 구현했을 땐 runtime error가 떴다
// 당연한게 2중 for문 안에서 전부 다 순회하면 굳이 에라토스테네스의 채로 구현한 이유가 없다
// 즉, 건너뛰어야 한다 -> for(int j = i, j<n+1; j=j+i)로 수정