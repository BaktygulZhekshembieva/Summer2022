package home_works_platform;

import java.util.Scanner;

public class HW_23_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число до 7");
        int weeknum = scan.nextInt();

        switch (weeknum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Это число больше 7");
        }

    }
}
