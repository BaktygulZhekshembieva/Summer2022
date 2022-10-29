package home_works_online;

public class HW2_DataTypes {
    public static void main(String[] args) {
        byte num1 = 87;
        short num2 = -30805;
        int num3 = 1154265485;
        long num4 = -8256418932763l;
        float num5 = 265.548f;
        double num6 = -265.5562;
        char sym1 = '$';
        char sym2 = 'b';
        char sym3 = 'B';
        char sym4 = '4';
        char sym5 = 87;
        char sym6 = 45;
        boolean isItDog = true;
        boolean isItCat = false;

        System.out.println(num2);
        System.out.println(num4);

        num2 = num1;
        System.out.println(num2);

        num5 = num2;
        System.out.println(num5);

        num6 = num3;
        System.out.println(num6);

        System.out.println(sym1);

        sym2 = sym6;
        System.out.println(sym2);

        System.out.println(isItDog);

        isItDog = isItCat;
        System.out.println(isItDog);

        String name1 = "Baktygul";
        String name2 = " ";
        String name3 = "is";
        String name4 = " ";
        String name5 = "beautiful";

        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);
        System.out.print(name4);
        System.out.println(name5);
    }
}
