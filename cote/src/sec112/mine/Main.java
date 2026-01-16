package sec112.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] c_list = in.next().toCharArray();

        for(int i = 0; i < n; i++){
            char c = 0;
            int binary_idx = 64;
            for(int j = 0; j<7; j++){
                int idx = i*7+j;
                if(c_list[idx] == '#'){
                    c+=binary_idx;
                }
                binary_idx=binary_idx/2;
            }
            System.out.print(c);
        }
    }
}