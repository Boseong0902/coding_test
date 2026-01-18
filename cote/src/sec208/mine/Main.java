package sec208.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> idxList = new LinkedList<Integer>();
        List<Integer> numList = new ArrayList<>();

        int num = sc.nextInt();
        idxList.add(num);
        numList.add(num);

        for(int i = 0; i < n-1; i++){
            int idx = 0;
            int k = sc.nextInt();
            while(k<idxList.get(idx)&&idxList.size()-1>idx){
                idx++;
            }
            if(idx == idxList.size()-1&&k<idxList.get(idx)){
                idxList.add(idx+1, k);
                numList.add(k);
            }
            else{
                idxList.add(idx,k);
                numList.add(k);
            }

        }

        for(int i:numList){
            System.out.print(idxList.indexOf(i)+1+" ");
        }
    }
}
