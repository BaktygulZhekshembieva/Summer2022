package if_else;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {

        /* if
        else if
        else if
        else if
        else if
        else
         */

//        int age = 17;
//        int age85 = 67;
//
//        System.out.println("Age from 0 to 25");
//        if (age > 0 && age < 25) {  // 18 - 50
//            if (age > 0 && age <= 1) {
//                System.out.println("Mladenec 100%");
//            } else if (age > 1 && age < 13) {
//                System.out.println("Rebenok 80%");
//            } else if (age >= 13 && age < 18) {
//                System.out.println("Podrostok 70%");
//            } else if (age >= 18 && age < 25) {  // 48 - 80
//                System.out.println("Iunnye 60%");
//            }
//        }
//
//        else if (age >= 25 && age <= 85) {
//            System.out.println("Vzroslyi 50%");
//        }
//
//        else if (age > 85) {
//            System.out.println("Dolgojitel' 40%");
//        }
//

        Scanner input = new Scanner(System.in);
        String userLogin = input.next();
        String userPassword = input.next();
        String login = "Bems@gmail.com";
        String password = "bems2022";

        if (userLogin.equals(login)){
            if (userPassword.equals(password)){
                System.out.println("Welcome!");
            }
            else {
                System.out.println("This password is not valid");

            }
        } else {
            System.out.println("This login is not valid");
        }

        // int num

        // if
        // else if
        // else if
        // else if
        //        if
        //        else if
        //        else if
        //        else
        // else if
        // else if

        // int num2

        // if
        //   if
        //      if
        //         if
        //         else if
        //         else if
        //         else
        // else if
        // else if
        // else
    }
}
