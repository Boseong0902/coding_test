package sec603.answer;

import java.util.*;

public class geminiSort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        Long start = System.nanoTime();
        int n = 10000;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int k = new  Random().nextInt(n);
            int idx = 0;

            // 1. 삽입할 위치 탐색 (ArrayList의 get(idx)는 O(1)이라 빠름)
            while (idx < list.size() && k > list.get(idx)) {
                idx++;
            }

            // 2. 찾아낸 위치에 삽입
            // ArrayList 내부에서 System.arraycopy()를 호출해 데이터를 밀어줍니다.
            list.add(idx, k);
        }

        // 출력 부분
        for (int x : list) {
            System.out.print(x + " ");
        }
        Long end = System.nanoTime();
        System.out.println("\n"+(end-start));

    }
}