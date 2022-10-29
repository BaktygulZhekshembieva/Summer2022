package home_works_platform;

public class HW_42 {
    public static void main(String[] args) {

        System.out.println(add(21,3));
        System.out.println(divide(21,3));
        System.out.println(multiply(21,3));
        System.out.println(subtract(21,3));

    }

    static int add(int num1, int num2){
        return num1 + num2;
    }

    static int divide(int num1, int num2){
        return num1 / num2;
    }

    static int multiply(int num1, int num2){
        return num1 * num2;
    }

    static int subtract(int num1, int num2){
        return num1 - num2;
    }
}
