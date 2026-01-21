package sec212.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 테스트 수

        int [][] score_list =  new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                score_list[i][j]=sc.nextInt();
            }
        }
        // 여기까지가 점수 입력받기

        int[][] mentor_list = new int[n][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k = j; k>=0; k--){
                    mentor_list[score_list[i][j]-1][score_list[i][k]-1]=1;
                }
            }
        }
        // 학생들이 각각 멘토링 가능한 여부 기록해놓는 배열 생성하고, 거기에 기록
        // ###########
        // # 4 3     #
        // # 3 4 1 2 #
        // # 4 3 2 1 #
        // # 3 1 4 2 #
        // ###########
        // 위의 경우,
        // #############
        // #   1 2 3 4 #
        // # 1 1 1 1 1 #
        // # 2 1 1 1 1 #
        // # 3 0 0 1 1 #
        // # 4 1 0 1 1 #
        // #############
        // 로 표시됨 -> 0으로 초기화 된 배열이니까, 안되는 멘토링을 1로 표시
        // 각 행은 멘토 대상, 각 열은 멘티 대상 -> 멘토 대상 학생과 멘티 대상 학생의 매칭 가능 여부롤 0과 1로 표시

        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(mentor_list[i][j]==0){
                    cnt++;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mentor_list[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(cnt);
    }
}