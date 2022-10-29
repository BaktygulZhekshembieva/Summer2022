package home_works_online;

import java.util.Scanner;

public class HW7_IfElse {
    public static void main(String[] args) {

        String login = "baku123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш логин!");
        String Answer = scan.nextLine();
        String tru = login;
        String  fal = "Baku123";

        if (Answer.equals(tru)){
            System.out.println("Вы успешно вошли в аккаунт");
                } else if (Answer.equals(fal)) {
                    System.out.println("введите логин с маленькой буквы");
                    } else {
                        System.out.println("Вы ввели не правильный логин");
                        }
    }
}
