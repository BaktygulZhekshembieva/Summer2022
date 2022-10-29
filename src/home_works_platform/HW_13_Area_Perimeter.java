package home_works_platform;

import java.util.Scanner;

public class HW_13_Area_Perimeter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width");
        double width = scan.nextDouble();
        System.out.println("Enter height");
        double height = scan.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * " + "(" + width + " + " + height + " ) = " + perimeter);
    }
}
