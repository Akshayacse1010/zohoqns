package practice;
//3) Given a string, we have to reverse the string without changing the position of punctuations and spaces.
//
//Sample:   house no : 123@ cbe
//
//Output:    ebc32 1o :  nes@ uoh
public class swapChars {
    public static void main(String[] args) {
        String s = "house no : 123@ cbe";
        StringBuilder sb = new StringBuilder(s);

        int i = 0 , j = s.length() -1;
        while(i <= j){
            if(!Character.isLetterOrDigit(s.charAt(i)) || Character.isWhitespace(s.charAt(i))){
                i++;
            }
            if(!Character.isLetterOrDigit(s.charAt(j)) || Character.isWhitespace(s.charAt(j))){
                j--;
            }
            else{
                // Swap characters using setCharAt() method
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        s= sb.toString();
        System.out.println(s);
    }
}
