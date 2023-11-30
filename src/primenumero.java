import java.util.Scanner;

public class primenumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the numbers up to which you want the prime numbers : ");
        int num = in.nextInt();



        for(int i=2; i <= num ; i++){
            if (isTheNumPrime(i)) {
                System.out.println(i);
            }






        }
    }

        static boolean isTheNumPrime(int num){
        if(num <=1){
            return false;
        }

        for (int i =2; i <= Math.sqrt(num); i++){
            if(num % i ==0){
                return false;
            }

        }
        return true;

    }
}

