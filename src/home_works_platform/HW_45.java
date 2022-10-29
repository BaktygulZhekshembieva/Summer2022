package home_works_platform;

import java.util.Scanner;

public class HW_45 {
    public static void main(String[] args) {

       System.out.println(bool());

    }

    static boolean bool(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Your years in college: ");
        int college = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Your years of programming experience: ");
        int experience = scanner1.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Your GPA: ");
        double GPA= scanner1.nextInt();

        if (college >= 4 && experience >= 2)
            return true;
        if (GPA >= 3.5)
            return true;
        return false;
    }
}
