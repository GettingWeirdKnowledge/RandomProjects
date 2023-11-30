import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number (A) : ");
        int a = in.nextInt();

        System.out.println("Enter the second number (B) : ");
        int b = in.nextInt();

        System.out.println("The first number (A) is " + a + " and the second number (B) is " + b + ".");

        swap(a, b);

        System.out.println("The first number (A) now is " + a + " and the second number (B) now is " + b + ".");

    }

    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        // This change is valid in this function scope only.

    }
}