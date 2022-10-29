package home_works_online;

import java.util.Scanner;

public class HW6_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Анкета \nкандидата на трудоустройство \nпо вакансии");
        String vak = input.nextLine();
        System.out.print("Фамилия");
        String pham = input.nextLine();
        System.out.print("Имя");
        String im = input.nextLine();
        System.out.print("Отчество");
        String ot = input.nextLine();
        System.out.print("Число, месяц, год рождения");
        String data = input.nextLine();
        System.out.print("Место жительства:");
        String mes = input.nextLine();
        System.out.println("______________________________________________");
        System.out.print("Контактные телефоны:");
        String tel = input.nextLine();
        System.out.println("(указать, какое время можно звонить)");
    }
}
