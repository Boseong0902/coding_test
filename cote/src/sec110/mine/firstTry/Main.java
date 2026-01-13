package sec110.mine.firstTry;
// 전략 :
// 각 문자들의 e로부터 떨어져있는 거리를 저장하는 리스트를 만들어서 관리
// 두 포인터를 사용(슬라이딩 윈도우 방식..?) e와 e사이만 우리가 볼 윈도우가 되는 것
// 그 앞의 문자들의 거리는 픽스
// 그 뒤의 문자들의 거리는 아직 측정 못함
// 일단 뒤에있는 포인터가 증가하면서, 윈도우 안에있는 문자들의 거리 값은 1씩 증가
// 그러다가 뒤에있는 포인터가 e를 만나면, 그 사이의 문자들의 거리값을 조정
// 앞에있는 포인터를 뒤에있는 포인터와 일치시키고 다시 뒤에있는 포인터를 1칸씩 뒤로 보냄

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] list = in.next().toCharArray();
        char ch = in.next().charAt(0);

        List<Integer> distance =  new ArrayList<>();
        int startPoint = 0;
        int endPoint = 0;
        int currentDistance = 0;

        for(int i = 0; i < list.length; i++){
            distance.add(0);
        }

        while(endPoint!=list.length&&startPoint<list.length){
            currentDistance++;
            if(list[endPoint]==ch){
                distance.set(endPoint,0);
                while(endPoint-startPoint>0){
                    if(distance.get(startPoint)>=currentDistance - distance.get(startPoint)){
                        distance.set(startPoint,currentDistance - distance.get(startPoint));
                    }
                    startPoint++;
                }
                currentDistance = 0;
            }
            else{
                distance.set(endPoint, currentDistance);
            }
            endPoint++;
        }
        for(int i : distance){
            System.out.print(i);
        }
    }
}

// 이 방식의 문제점 -> aaaaae e 의 경우, 123210이 나온다
// 즉, 맨 처음 윈도우에 대한 처리가 부정확하다