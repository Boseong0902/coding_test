package sec305.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] list = new int[n/2+1];

        int startSum = 1;
        int endSum = 1;
        int sum = 0;
        int cnt = 0;

        while(endSum<n+1) {
            if (sum > n) {
                sum -= startSum++;
            } else if (sum == n) {
                cnt++;
                sum -= startSum++;
            } else {
                sum += endSum++;
            }
        }
        System.out.println(cnt);
    }
}
