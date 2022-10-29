package loops;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {

        String login = "tilek";
        int password1 = 123;

        Scanner scan = new Scanner(System.in);

        int i = 1, j = 1;
        while (i <= 3) {
            System.out.println("Введите свой логин");
            String userLogin = scan.nextLine();
            if (userLogin.equals(login)) {
                while (j <= 3) {
                    System.out.println("Введите пароль");
                    int userPassword = scan.nextInt();
                    if (userPassword == password1) {
                        System.out.println("Вы вошли в аккаунт");
                        break;
                    }
                    System.err.println("Вы ввели не правильный пароль, введите правильный пароль!");
                    j++;
                    if (j == 4){
                        System.err.println("Повторите попытку через 24 часа");
                    }
                }
                break;
            } else {
                System.err.println("Вы ввели не правильный логин");
            }
            i++;
            if (i == 4){
                System.err.println("Повторите попытку через 24 часа");
            }
        }

//        int i = 3;
//        int j = 3;
//        while(i > 0) {
//            System.out.println("Введите свой логин: ");
//            String userLogin = scan.next();
//            if (userLogin.equals(login)) {
//                while (j > 0) {
//                    System.out.println("Введите свой пароль: ");
//                    String userPassword = scan.next();
//                    if (userPassword.equals(password)) {
//                        System.out.println("Вы вошли в аккаунт");
//                        break;
//                    }
//                    System.err.println("Вы ввели не правльный пароль");
//                    System.out.println(j - 1 + "- осталось попыток");
//                    j--;
//                    if (j == 0) {
//                        System.err.println("Повторите попытку через 24 часа");
//                    }
//                }
//                break;
//            } else {
//                System.err.println("Вы ввели не правльный логин");
//                System.err.println(i - 1 + " - осталось попыток");
//            }
//            i--;
//            if (i == 0) {
//                System.err.println("Повторите попытку через 24 часа");
//            }
//        }
    }
}
