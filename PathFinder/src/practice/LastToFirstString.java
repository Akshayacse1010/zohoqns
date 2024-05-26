package practice;

import java.util.Arrays;

/*5) Given a string, change the order of words in the string (last string should come first).

Should use RECURSION

Sample:   one two three

Output :  three two one

Should solve atleast 3 problems……Around 30 students cleared this round.*/
public class LastToFirstString {
    public static void main(String[] args) {
        String s = "one two three";
        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));
        printrec( 0 , arr);
    }

    private static void printrec(int i, String[] arr) {
        if( i == arr.length){
            return;
        }
        printrec(i + 1 , arr);
        System.out.print(arr[i] + " ");
    }
}
