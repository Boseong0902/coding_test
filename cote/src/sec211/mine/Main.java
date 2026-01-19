package sec211.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> [] sets = new Set[n];
        for(int i=0;i<n;i++){
            sets[i] = new HashSet<>();
        }

        int [][] studentsList = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                studentsList[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < n; j++){
                for(int k = j+1; k<n; k++){
                    if(studentsList[j][i] == studentsList[k][i]){
                        sets[j].add(k);
                        sets[k].add(j);
                    }
                }
            }
        }
        int leader = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(sets[i].size()>max){
                max = sets[i].size();
                leader = i;
            }
        }
        System.out.println(leader+1);

    }
}