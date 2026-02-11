package sec708.mine.twiceTry;


import java.util.*;
public class Main{
    static int bfs(int start, int end){
        Deque<Integer> q = new ArrayDeque<>();
        boolean [] check = new boolean[10001];

        q.offerLast(start);
        check[start] = true;
        int cnt = 0;

        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0; i<sz; i++){
                int k = q.pollFirst();
                if(k==end){
                    return cnt;
                }

                if(k-1>=0 && !check[k-1]){
                    check[k-1] = true;
                    q.offerLast(k-1);
                }
                if(k+1>=0 && !check[k+1]){
                    check[k+1] = true;
                    q.offerLast(k+1);
                }
                if(k+5>=0 && !check[k+5]){
                    check[k+5] = true;
                    q.offerLast(k+5);
                }
            }
            System.out.println(q);
            cnt++;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(bfs(n,m));
    }
}