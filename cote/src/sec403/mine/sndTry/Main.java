package sec403.mine.sndTry;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]list = new int[n];
        int startPoint = 0;
        int endPoint = m-1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }

        // 첫 윈도우 세팅
        for(int i = 0; i<m; i++){
            map.put(list[i],map.getOrDefault(list[i],0)+1);
        }
        System.out.print(map.size()+" ");

        // 나머지 윈도우 처리
        while(endPoint<n-1){
            map.put(list[startPoint],map.get(list[startPoint])-1);
            if(map.get(list[startPoint]) == 0){
                map.remove(list[startPoint]);
            }
            startPoint++;
            endPoint++;
            map.put(list[endPoint], map.getOrDefault(list[endPoint],0)+1);
            System.out.print(map.size()+" ");
        }
    }
}
// getOrDefault(object Key,V defaultValue) :
// key값이 존재하면, key값의 value반환, 없으면 defaultValue반환