package home_works_platform;

import java.util.Scanner;

public class HW_30 {
    public static void main(String[] args) {

        Scanner width = new Scanner(System.in);
        System.out.println("Enter width of the right triangle");
        int widthi = width.nextInt();

        Scanner height = new Scanner(System.in);
        System.out.println("Enter height of the right triangle");
        int heighti = height.nextInt();

        double area = (heighti * widthi) / 2;
        System.out.println("Area of triangle is: " + area);

    }
}
