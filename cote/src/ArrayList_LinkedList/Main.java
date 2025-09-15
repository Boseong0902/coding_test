package ArrayList_LinkedList;
// ArrayList vs LinkedList - 삽입, 조회에 요구되는 시간 비교
import java.util.*;

public class Main{
    public static void main(String[] args){
        long start = 0, end = 0;

        // 데이터 삽입 추가 시간
        List<Integer>AList = new ArrayList<>();
        List<Integer>LList = new LinkedList<>();

        start = System.nanoTime();
        for(int i = 0; i<100000; i++){
            AList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println(end-start);
        start = System.nanoTime();
        for(int i = 0; i<100000; i++){
            LList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println(end-start);

        // 데이터 조회 시간
        start = System.nanoTime();
        for(int i = 0; i<100000; i++){
            AList.get(i);
        }
        end = System.nanoTime();
        System.out.println(end-start);
        start = System.nanoTime();
        for(int i = 0; i<100000; i++){
            LList.get(i);
        }
        end = System.nanoTime();
        System.out.println(end-start);
    }
}