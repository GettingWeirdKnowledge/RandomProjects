import java.util.Scanner;

public class primefactors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number you want prime factorisation for : ");
        int num = in.nextInt();

        int div = 2;

        System.out.println("The prime factors are : ");

        while (num > 2){

            while (num % div ==0){

                System.out.print(div + " ");

                num /= div;
            }


//            System.out.println("The prime factorisation is : ");

//            while (num % div ==0){
//                System.out.println(div + "x ");
//            }
            div++;

        }


    }
}

