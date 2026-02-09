package sec607.mine;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(new int[]{sc.nextInt(),sc.nextInt()});
        }

        for(int i=1;i<n;i++){
            int k = i;
            while(k>0){
                if(list.get(k-1)[0]>list.get(k)[0]){
                    list.add(k-1,list.get(k));
                    list.remove(k+1);
                    k--;
                }
                else if(list.get(k-1)[0] == list.get(k)[0]){
                    if(list.get(k-1)[1]>list.get(k)[1]){
                        list.add(k-1,list.get(k));
                        list.remove(k+1);
                        k--;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
        for(int i = 0; i<n; i++){
            System.out.println(list.get(i)[0]+" "+list.get(i)[1]);
        }
    }
}