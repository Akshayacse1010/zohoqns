public class leastPrime {
  static int[] prime = new int[1001];

   static void least(){
        for(int i = 1; i < 1000 ;i++){
            prime[i] = 1;
        }
        prime[1] = 0;
        for(int i = 2; i *i <= 1000; i++){
           if(prime[i] == 1){
               for(int j =i*i; j <= 1000; j+=i){
                   prime[j] = 0;
               }
           }
        }
    }
    public static void main(String[] args) {
            least();
        for(int i = 0; i < 1000 ; i++){
           if( prime[i] == 1){
               System.out.print(i + " ");
           }
        }
    }
}
