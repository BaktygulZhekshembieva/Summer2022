package home_works_platform;

import java.util.Scanner;

public class HW_37_if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш балл: ");
        int marks = scanner.nextInt();

        if (marks >= 80){
            System.out.println('A');
        } else if (marks >= 60){
            System.out.println('B');
        } else if (marks >= 40){
            System.out.println('C');
        }else {
            System.out.println('D');
        }
    }

}
