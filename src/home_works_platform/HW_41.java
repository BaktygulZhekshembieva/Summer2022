package home_works_platform;

import java.util.Scanner;

public class HW_41 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int num2 = scanner2.nextInt();

        System.out.println("The sum is: " + sum(num1,num2));

    }
    static int sum(int a, int b){
        return a + b;
    }
}
