import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {

        int sumtwo = Sum();

        System.out.println("The sum of both numbers is : " + sumtwo);

        int twosum = Sum();
        System.out.println("The sum of TWO numbers is : " + twosum);
    }

    private static int Sum() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a = in.nextInt();

        System.out.println("Enter the second number : ");
        int b = in.nextInt();

        int sum = a +b ;

        return sum;
    }
}
