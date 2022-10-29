package home_works_platform;

import java.util.Scanner;

public class HW_38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возрост: ");
        double age = scanner.nextDouble();

        if (age <= 16){
            System.out.println("You can't drive.");
        } else if (age <= 17){
            System.out.println("You can drive but not vote.");
        } else if (age <= 24  ){
            System.out.println("You can vote but not rent a car.");
        }else {
            System.out.println("You can do pretty much anything.");
        }
    }
}
