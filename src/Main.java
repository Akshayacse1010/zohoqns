import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Set<Character> hs = new LinkedHashSet<>();
        String s = "bbccaa";
       for (int i =0; i < s.length(); i++){
           hs.add(s.charAt(i));
       }
        System.out.println(hs);
        }
    }
