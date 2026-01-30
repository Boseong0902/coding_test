package sec604.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> cache = new LinkedList<>();
        Set<Integer> missOrHit = new HashSet<>();

        for(int i = 0; i < m; i++) {
            int pid = sc.nextInt();
            if(missOrHit.contains(pid)) {
                cache.remove(cache.indexOf(pid));
                cache.add(pid);
            }
            else{
                missOrHit.add(pid);
                cache.add(pid);
            }
            if(cache.size() > n){
                int removed = cache.get(0);
                cache.remove(0);
                missOrHit.remove(removed);
            }
        }
        for(int i = cache.size()-1; i >= 0; i--) {
            System.out.print(cache.get(i)+" ");
        }

    }
}