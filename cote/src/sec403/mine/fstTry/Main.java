package sec403.mine.fstTry;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int []list = new int[n];
        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        for(int i = 0; i<n-m+1; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i; j<i+m; j++){
                set.add(list[j]);
            }
            System.out.print(set.size()+" ");
        }
    }
}