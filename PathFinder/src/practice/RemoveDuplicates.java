package practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {



    public static void main(String[] args) {
       String s = "qwertyuiopasdfghjklzxcvbnmmnbvcxzlkjhgfdspoiuytrewqa";
       removeRepeat(s);
    }

    private static void removeRepeat(String s) {
    int[] arr = new int[26];
    String ans = "";
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(c >= 97 || c <= 122){
            if(arr[c - 97 ] == 0){
                ans+= c;
                arr[c - 97] = 1;
            }
        }
        else if( c >= 65 && c <= 90){
            if(arr[c - 65 ] == 0){
                ans+= c;
                arr[c - 65] = 1;
            }
        }
    }
        System.out.println(ans);
    }
}
