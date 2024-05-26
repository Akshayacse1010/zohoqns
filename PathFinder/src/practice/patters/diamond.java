package practice.patters;
/*
   1

  3 2

 6 5 4

10 9 8 7

10 9 8 7

 6 5 4

  3 2

   1*/
public class diamond {
    public static void main(String[] args) {
        int n =4;
        int l = 1;
       for(int i = 1; i <= n; i++){
           for(int j = 1 ; j <= n - i; j++){
               System.out.print(" ");
           }

           for(int k = 1 ; k <= i; k++){
               System.out.print( "*" + " ");
           }
           System.out.println();
       }
       l--;
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <i; j++){
               System.out.print(" ");
           }
           for(int k = 1; k <= n-i + 1; k++){
               System.out.print("*" + " ");
           }
           System.out.println();
       }

    }
}
