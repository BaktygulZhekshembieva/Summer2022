package home_works_online;

import java.util.Scanner;

public class HW15_2 {
    public static void main(String[] args) {

        System.out.println(access());
    }
    public static String access () {

        String userLogin1 = "Alex";
        String userLogin2 = "Kate";
        String userLogin3 = "Bema";
        String userPassword1 = "123";
        String userPassword2 = "456";
        String userPassword3 = "789";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = sc.nextLine();

        if (login.equals(userLogin1)) {
            System.out.println("Введите пароль");
            String password1 = sc.nextLine();
            if (password1.equals(userPassword1)) {
                return "Вы вошли в аккаунт";
            } else {
                return "Неверный пароль";
            }
        } else if (login.equals(userLogin2)) {
            System.out.println("Введите пароль");
            String password2 = sc.nextLine();
            if (password2.equals(userPassword2)) {
                return "Вы вошли в аккаунт";
            } else {
                return "Неверный пароль";
            }
        } else if (login.equals(userLogin3)) {
            System.out.println("Введите пароль");
            String password3 = sc.nextLine();
            if (password3.equals(userPassword3)) {
                return "Вы вошли в аккаунт";
            } else {
                return "Неверный пароль";
            }
        }
        return "Неверный логин";
    }
}
