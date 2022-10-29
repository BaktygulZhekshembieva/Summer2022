package home_works_platform;

import java.util.Scanner;

public class HW_44_OddEvenTest {
    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isOdd(4));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        oddEven(num);
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void oddEven(int num){
        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }
    }

}

