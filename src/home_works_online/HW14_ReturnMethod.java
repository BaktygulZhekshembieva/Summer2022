package home_works_online;

import java.util.Scanner;

public class HW14_ReturnMethod {
    public static void main(String[] args) {

        exchangeRates(); //if enter 10 --> 10.0 доллар = 826.5 сом
        exchangeRates(); //if enter 1000 --> 1000.0 доллар = 82650.0 сом

        HW14_ReturnMethod obj = new HW14_ReturnMethod();

        obj.exchangeRates1();  // if enter 100 --> 100.0 доллар = 8265.0 сом
        obj.exchangeRates1();  // if enter 55 --> 55.0доллар = 4545.75 сом

        System.out.println(exchangeRates2()); // if enter 3 --> 3.0 доллар = 247.95000000000002 сом
        System.out.println(exchangeRates2()); // if enter 900 --> 900.0 доллар = 74385.0 сом

        System.out.println(obj.exchangeRates3()); // if enter 500 --> 500.0 доллар = 41325.0 сом
        System.out.println(obj.exchangeRates3()); // if enter 2500 --> 2500.0 доллар = 206625.0 сом
    }
    public static void exchangeRates(){
        Scanner scanner = new Scanner(System.in);
        double dol = scanner.nextDouble();
        double result = dol * 82.65;
        System.out.println(dol + " доллар = " + result + " сом");
    }
    public void exchangeRates1(){
        Scanner scanner = new Scanner(System.in);
        double dol = scanner.nextDouble();
        double result = dol * 82.65;
        System.out.println(dol + " доллар = " + result + " сом");
    }
    public static String exchangeRates2() {
        Scanner scanner = new Scanner(System.in);
        double dol = scanner.nextDouble();
        double dol1 = dol * 82.65;
        return dol + " доллар = " + dol1 + " сом";
    }
    public String exchangeRates3() {
        Scanner scanner = new Scanner(System.in);
        double dol = scanner.nextDouble();
        double dol1 = dol * 82.65;
        return dol + " доллар = " + dol1 + " сом";
    }
}
