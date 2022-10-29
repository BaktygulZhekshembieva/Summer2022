package wrapper_classes;

import java.util.Scanner;

public class WrapperClasses {
    public static void main(String[] args) {
//        byte, short, int, long
//        float, double
//        char
//        boolean

        byte num1 = 78; //оранж- переменная, примитив
        Byte num2 = 68; //белый - объект, непримитив
        Short num3 = 34;
        Integer num4 = new Integer(35);
        Long num5 = new Long(245);
        Integer num6 = 35;
        Long num7 = 2546l;

        Float num8 = 29.08f;
        Double num9 = 89.125;

        System.out.println(Integer.max(23, 9));
        System.out.println(num1);
        System.out.println(num2.intValue());
        System.out.println(num2.floatValue());

// Autoboxing
        int num10 = 87;
        Integer num11 = num10;

// Unboxing
        Long num12 = 125l;
        long num13 = num12;




    }
}
