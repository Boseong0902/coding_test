package sec508.mine;

// 해시맵 - 자기보다 우선순위가 있는지 체크
// 큐 - 실제 대기 줄
// 중복된 우선순위 문제로 정확한 순서 식별 불가 - 해당 인덱스 갱신해가면서 체크
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = sc.nextInt();
        int cnt = 1;
        SortedMap<Integer, Integer> map = new TreeMap<>();
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            int k =  sc.nextInt();
            map.put(k, map.getOrDefault(k, 0)+1);
            queue.offerLast(k);
        }

        while(!queue.isEmpty()){
            int k = queue.pollFirst();
            if(idx==0){
                if(map.lastKey()==k){
                    System.out.println(cnt);
                    break;
                }
                else{
                    queue.offerLast(k);
                    idx = queue.size()-1;
                }
            }
            else{
                if(map.lastKey()==k){
                    cnt++;
                    idx--;
                    if(map.get(k)==1){
                        map.remove(k);
                    }
                    else{
                        map.put(k, map.get(k)-1);
                    }
                }
                else{
                    queue.offerLast(k);
                    idx--;
                }
            }
        }
    }
}