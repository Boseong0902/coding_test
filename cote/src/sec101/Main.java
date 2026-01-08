package sec101;
import java.util.*;

public class Main{
    public int solution(String str,char c){
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T =  new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        System.out.print(T.solution(str,c));
    }
}