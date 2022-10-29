package data_types;

public class DataTypes1 {
    public static void main(String[] args) {
        //Primitive data tapes
        // variable (peremennaya)
        byte number1 = -120;
        short number2 = 12345;
        int number3 = 1234567890;
        long number4 = 12346778909l;

        number4 = number2;  // number4 = 12345;
        // 12346778909l = 12345;

        System.out.println(number1);  // -128
        System.out.println(number4);  // 12345
        System.out.println(number2);  // 12345

        number2 = 338;
        System.out.println(number2); // 338
        System.out.println(number2); // 338

        float num1 = 89.35f;
        double num2 = 79.356;

        char symbol1 = 'P';
        char symbol2 = '#';
        char symbol3 = '+';
        char symbol4 = '@';
        char symbol5 = '8';
        char a = 65;
        char symbol7 = 60;
        char symbol8 = 125;
        char symbol9 = 1028;

        System.out.println(symbol4);
        System.out.println(symbol3);
        System.out.println(a);
        System.out.println(symbol7);
        System.out.println(symbol8);
        System.out.println(symbol9);

        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        boolean isWinterCold = true;
        System.out.println(isWinterCold);
        boolean isSummerCold = false;
        System.out.println(isSummerCold);

        // Non primitive data types

        String name = "Bema";
        String city = "Bishkek312";
        String ten = "10";
        String empty = "";
        String letter = "R";

        System.out.println("12" + "5");
        System.out.println(17);

        float ticket = 400.50f;
    }
}
