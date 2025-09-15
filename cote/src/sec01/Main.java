package sec01;
import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        System.out.println(alist);

        List<Double> blist = new Vector<>();
        blist.add(4.0);
        blist.add(5.0);
        blist.add(6.0);

        alist.addAll(blist);
        System.out.println(alist);
    }
}