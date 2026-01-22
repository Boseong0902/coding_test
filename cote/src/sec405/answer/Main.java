package sec405.answer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        long startTime = System.nanoTime();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. TreeSet 생성 (내림차순 정렬을 위해 Collections.reverseOrder() 적용)
        // 중복을 자동으로 제거하고, 데이터를 넣는 즉시 큰 순서대로 정렬합니다.
        TreeSet<Integer> sumSet = new TreeSet<>(Collections.reverseOrder());

        // 3. 3중 for문으로 모든 조합 탐색 (O(N^3))
        // i, j, l이 서로 겹치지 않게 인덱스를 설정합니다.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    sumSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        // 4. K번째 값 추출
        int count = 0;
        int result = -1; // K번째가 없을 경우를 대비해 -1로 초기화

        // TreeSet은 인덱스(get)가 없으므로 확장 for문으로 순회하며 카운트합니다.
        for (int x : sumSet) {
            count++;
            if (count == k) {
                result = x;
                break;
            }
        }

        // 5. 결과 출력
        System.out.println(result);
        long endTime = System.nanoTime();
        System.out.println("\n"+(endTime - startTime));
    }
}

// 574247167
// 내 코드보다 두배 느림