package home_works_platform;

import java.util.Scanner;

public class HW_19_FahrenheitCelsius {
    public static void main(String[] args) {
        //1
          Scanner scan = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenhei");
        double fahrenhei = scan.nextDouble();

        double celsius = (fahrenhei - 32) * 5 / 9;
        System.out.println(fahrenhei + " градус по Фаренгейту = " + celsius + " ⁰C");

        System.out.println("--------------------------------");
        //2
        System.out.println("Enter inches");
        double inches = scan.nextDouble();

//        double meter = inches / 39.370;
        double meter = inches * 0.0254;
        System.out.println(inches + " inch is " + meter + " meters");
    }
}
