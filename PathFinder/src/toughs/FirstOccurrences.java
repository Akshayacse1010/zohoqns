package toughs;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurrences {

    public static void main(String[] args) {
        String s1 = "ZOHOCORPORATION";
        String s2 = "PORT";

        Map<Character , Integer> mp = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            if(!mp.containsKey(s1.charAt(i))){
                mp.put(s1.charAt(i) , i);
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s2.length(); i++){
            if(mp.containsKey(s2.charAt(i))){
                min = Math.min(min , mp.get(s2.charAt(i)));
                max = Math.max(max , mp.get(s2.charAt(i)));
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(s1.charAt(i));
        }
    }
}
