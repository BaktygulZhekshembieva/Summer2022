package scanner1;

import java.util.Scanner;

public class ScannerClass1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);  // object of Scanner
        System.out.println("Instagram: Please enter your login");
        String login = input.nextLine();
        System.out.println("Instagram: This is your login " + login);
        System.out.println("Instagram: Please enter your password");
        String password = input.nextLine();
        System.out.println("Instagram: Your password is " + password);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println("This is your full name " + fullName);
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old");
        System.out.println("Are you married?");
        boolean status = input.nextBoolean();
        System.out.println("Are you married? " + status);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Your name is " + name);

//        String gender = input.next();
//        System.out.print(gender);

        // next --> first word
        // nextLine --> all words


//        int num = 78;
//        String str = "true";

        // ctrl + /
        // command + /



    }
}
