package home_works_platform;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class HW_14_Circle_Area_Perimeter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scan.nextDouble();

        double per = 2 * radius * 3.14;
        double area = 3.14 * radius * radius;

        System.out.println("Perimeter is = " + per);
        System.out.println("Area is = " + area);
    }
}
