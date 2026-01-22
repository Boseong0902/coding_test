package sec405.mine;

// 전략: treeset으로 각 뽑은 카드들의 합 저장
// 여기서, 합 계산 방법은 3중 for문으로 구현하되, 계산횟수를 줄이기 위해 마지막 loop는 k번까지로 제한
//      마지막 루프가 k번을 넘어가면 어차피 그 세 수의 합산으로 k번째 큰 숫자는 안나온다
// 이러면 물론 정렬하는데 시간이 걸리긴 하지만 → 이것도 LinkedList로 입력받음과 동시에 정렬해서 그렇게까지 많이 걸리진 않음
//      treeSet에 저장할 원소 수도 줄이고, 결국 3번째 루프에서의 불필요한 연산을 제외할 수 있음

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long startTime = System.nanoTime();
        List<Integer> list = new LinkedList<>();
        TreeSet<Integer> sumSet = new TreeSet<>();

        for(int i = 0; i < n; i++){
            int idx = 0;
            int num =  sc.nextInt();
            while(idx<list.size()&&num<list.get(idx)){
                idx++;
            }
            list.add(idx, num);
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int idx = j+1;
                while(idx<n&&idx<j+k+1){
                    sumSet.add(list.get(i)+list.get(j)+list.get(idx));
                    idx++;
                }
            }
        }

        int num = 0;
        while(!sumSet.isEmpty()&&num<k-1){
            sumSet.pollLast();
            num++;
        }
        if(sumSet.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.print(sumSet.last());
        }
        long endTime = System.nanoTime();
        System.out.println("\n"+(endTime - startTime));
    }
}


// 293342334