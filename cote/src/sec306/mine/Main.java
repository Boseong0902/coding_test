package sec306.mine;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int []list = new int[n];

        int startWindow = 0;
        int endWindow = 0;

        int zeroToOne = 0;

        int sequenceOne = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }

        while(endWindow<n){
            if(list[endWindow]==0){
                zeroToOne++;
                if(zeroToOne<=m){
                    endWindow++;
                }
                else{
                    sequenceOne = endWindow-startWindow;
                    while(zeroToOne>m){
                        if(list[startWindow]==0){
                            startWindow++;
                            zeroToOne--;
                        }
                        else{
                            startWindow++;
                        }
                    }
                    endWindow++;
                    if(max<sequenceOne){
                        max=sequenceOne;
                    }
                }
            }
            else{
                endWindow++;
            }
        }
        System.out.println(max);
    }
}