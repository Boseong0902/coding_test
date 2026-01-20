package sec302.mine;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            aSet.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            bSet.add(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>();
        list.add(0);
        if(aSet.size()>bSet.size()){
            for(int i : aSet){
                if(bSet.contains(i)){
                    int j = 0;
                    while(list.get(j)<i&&list.size()-1>j){
                        j++;
                    }
                    list.add(j,i);
                }
            }
        }
        else{
            for(int i : bSet){
                if(aSet.contains(i)){
                    int j = 0;
                    while(list.get(j)<i&&list.size()-1>j){
                        j++;
                    }
                    list.add(j,i);
                }
            }
        }
        for(int i=0; i<list.size()-1;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}