package methods;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your login");
        String login = scan.nextLine();

//        if (login.equals(userLogin1)) {
//            System.out.println("Please enter your password");
//            String password = scan.nextLine();
//            if (password.equals(userPassword1)){
//                System.out.println("Вы вошли в аккаунт");
//            } else {
//                System.out.println("Ваш пароль не верный");
//            }
//        } else if (login.equals(userLogin2)) {
//            System.out.println("Please enter your password");
//            String password = scan.nextLine();
//            if (password.equals(userPassword2)) {
//                System.out.println("Вы вошли в аккаунт");
//            } else {
//                System.out.println("Ваш пароль не верный");
//            }
//        } else if (login.equals(userLogin3)) {
//            System.out.println("Please enter your password");
//            String password = scan.nextLine();
//            if (password.equals(userPassword3)) {
//                System.out.println("Вы вошли в аккаунт");
//            } else {
//                System.out.println("Ваш пароль не верный");
//            }
//        } else {
//            System.out.println("Ваш логин не верный");
//        }

        System.out.println(loginBase(login));

    }

    public static String loginBase (String login) {
        String userLogin1 = "Alex";
        String userLogin2 = "Kate";
        String userLogin3 = "Bema";
        if (login.equals(userLogin1)){
            return userLogin1;
        } else if (login.equals(userLogin2)){
            return  userLogin2;
        } else if (login.equals(userLogin3)){
            return userLogin3;
        } else {
            return "Not found";
        }
    }

//    public static  String  passwordBase(String password){
//        String userPassword1 = "123";
//        String userPassword2 = "456";
//        String userPassword3 = "789";
//    }

}