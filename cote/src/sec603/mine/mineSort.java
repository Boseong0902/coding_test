package sec603.mine;

import java.util.*;
public class mineSort {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int n = 10000;
        Long start = System.nanoTime();
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            int idx = 0;
            int k = new Random().nextInt(n);
            while(idx<list.size()&&k>list.get(idx)){
                idx++;
            }
            list.add(idx, k);
        }
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        Long end = System.nanoTime();
        System.out.println("\n"+(end-start));
    }
}