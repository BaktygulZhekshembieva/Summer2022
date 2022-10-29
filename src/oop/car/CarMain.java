package oop.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        Car name = new Car("BMW", "X6", 2020, "black", 6598, false);
//        System.out.println(name);
//        name.model = "X5";
//        System.out.println(name);
//        name.setCrashed(true);
//        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите: "  + "\n2 если у машины передний или задний привод " +
                "                          \n4 если у машины полный привод");
        int drive = sc.nextInt();
        int drive1 = drive / 2;
        int drive2 = drive / 4;

        System.out.println(name.driveMode(drive1, drive1));
        System.out.println(name.driveMode(drive2, drive2, drive2, drive2));

    }
}