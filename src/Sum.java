import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {


        String userName;
        Scanner input = new Scanner(System.in);

            System.out.println("Hey, what's your name ? : ");
            userName = input.next();

        String personalised = myGreet(userName);
        System.out.println(personalised);

    }

 static String myGreet(String name) {

        String message = "Hello " + name + " , how was your day ?";
        return message;

    }
    // return the value

}