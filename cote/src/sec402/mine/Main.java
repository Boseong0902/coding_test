package sec402.mine;

import java.util.*;
public class Main {
    static boolean checkAnagram(String word1, String word2){ //map 사용
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<word1.length();i++){
            if(!map.containsKey(word1.charAt(i))){
                map.put(word1.charAt(i), 1);
            }
            else{
                int tmp = map.get(word1.charAt(i));
                map.replace(word1.charAt(i), tmp+1);
            }
        }
        for(int i = 0; i<word2.length();i++){
            if(!map.containsKey(word2.charAt(i))||map.get(word2.charAt(i))==0){
                return false;
            }
            else{
                int tmp = map.get(word2.charAt(i));
                map.replace(word2.charAt(i), tmp-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        if(checkAnagram(word1,word2)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}