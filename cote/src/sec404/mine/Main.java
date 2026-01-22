package sec404.mine;

// 전략 :
// 슬라이딩 윈도우 기법 사용
// 각 문자들의 숫자를 저장하는 map구조 채택
// 윈도우를 슬라이딩할 때마다, 추가되는 문자는 value++, 제외되는 문자는 value--
// 주어진 문자열의 키값과

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[] sList =  sc.next().toCharArray();
        char[] tList = sc.next().toCharArray();
        int startPoint = 0;
        int endPoint = tList.length-1;
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        int cnt = 0;
        boolean flag = true;

//        윈도우를 비교할 맵 설정
        for(int i=0;i<tList.length;i++){
            tMap.put(tList[i],tMap.getOrDefault(tList[i],0)+1);
        }

//        첫 윈도우 셋팅
        for(int i=0;i<tList.length;i++){
            sMap.put(sList[i], sMap.getOrDefault(sList[i],0)+1);
        }

//        윈도우 검사
        for(Map.Entry<Character,Integer> entry:tMap.entrySet()){
            // 윈도우에 비교군의 키가 없거나, 키에 해당하는 값이 다르면 break
            if(!sMap.containsKey(entry.getKey())||sMap.get(entry.getKey())!=entry.getValue()){
                flag = false;
                break;
            }
        }

        if(flag){
            cnt++;
        }

        while(endPoint<sList.length-1){
            flag = true;
            sMap.put(sList[startPoint],sMap.get(sList[startPoint])-1);
            if(sMap.get(sList[startPoint]) == 0){
                sMap.remove(sList[startPoint]);
            }
            startPoint++;
            endPoint++;
            sMap.put(sList[endPoint],sMap.getOrDefault(sList[endPoint],0)+1);

            for(Map.Entry<Character,Integer> entry:tMap.entrySet()){
                if(!sMap.containsKey(entry.getKey())||sMap.get(entry.getKey())!=entry.getValue()){
                    flag = false;
                    break;
                }
            }
//            다 통과하면
            if(flag){
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}

// map순회 방식 -> for(Map.Entry<Character,Integer> entry:tMap.entrySet())