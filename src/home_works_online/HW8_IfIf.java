package home_works_online;

import java.util.Scanner;

public class HW8_IfIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст!");
        int voz = scan.nextInt();
        System.out.println("Введите ваш вес!");
        int ves = scan.nextInt();

        if (voz >= 18){
            if (ves >= 50){
                System.out.println("Вы можете сдавать кровь");
            }else {
                System.err.println("Вы не можете сдавать кровь");
            }
        }else {
            System.out.println("Возраст должен быть больше 18 лет");
        }
    }
}
