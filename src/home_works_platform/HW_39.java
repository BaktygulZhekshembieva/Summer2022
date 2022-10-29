package home_works_platform;

import java.util.Scanner;

public class HW_39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        System.out.print("Введите ваш возрост: ");
        double age = scanner.nextDouble();

        if (age <= 16)
            System.out.println("You can't drive, " + name);
        if (age > 16 && age <= 17)
            System.out.println("You can drive but not vote, " + name);
        if (age > 17 && age <= 24  )
            System.out.println("You can vote but not rent a car, " + name);
        if (age > 24 && age <= 100  )
            System.out.println("You can do pretty much anything, " + name);

    }
}
