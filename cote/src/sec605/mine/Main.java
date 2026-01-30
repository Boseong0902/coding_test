package sec605.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            int k =  sc.nextInt();
            if(set.contains(k)) {
                flag = false;
                break;
            }
            set.add(k);
        }
        if(flag) {
            System.out.print("U");
        }
        else{
            System.out.print("D");
        }
    }
}