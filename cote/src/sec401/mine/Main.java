package sec401.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] vote = sc.next().toCharArray();
        char[] candidate = {'A','B','C','D','E'};
        int [] candidateVote = new int[5];

        for(char c:vote){
            if(c=='A'){
                candidateVote[0]++;
            }
            else if(c=='B'){
                candidateVote[1]++;
            }
            else if(c=='C'){
                candidateVote[2]++;
            }
            else if(c=='D'){
                candidateVote[3]++;
            }
            else if(c=='E'){
                candidateVote[4]++;
            }
        }
        int max = 0;
        char leader = 0;
        for(int i = 0; i<5;i++){
            if(candidateVote[i]>max){
                max = candidateVote[i];
                leader = candidate[i];
            }
        }
        System.out.print(leader);
    }
}