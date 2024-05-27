package practice.patters.patters;
/*
* 13.Print the word with odd letters – PROGRAM

Sample Output-

P      P

 R    R

  O  O

   G

  R  R

 A    A

M      M*/
public class XPrinting {
    public static void main(String[] args) {
        String s = "program";
        int n = s.length() - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == i || j == n - i) {
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

