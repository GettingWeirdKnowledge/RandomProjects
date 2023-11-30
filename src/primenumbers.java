import java.util.Scanner;
public class primenumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number upto which the prime numbers are to be displayed : ");
        int inNum = in.nextInt();

        for (int i = 2 ; i<= inNum ; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }


        }

        public static boolean isPrime(int num){

        if(num <=1){
            return false;
        }

        for (int i=2 ; i<= Math.sqrt(num) ; i++){
            if (num %i ==0){
                return false;
            }
        }
        return true;



    }
}
