package home_works_online;

import java.util.Scanner;

public class HW9_IfElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Введите ваш факультет");
        String fac = scan.nextLine();
//        System.out.println("Введите ваш курс");
//        String kur = scan.next();

        String f1 = "Экономический";
        String f2 = "Юридический";
        String k1 = "первый";
        String k2 = "второй";
        String k3 = "третий";

        if(fac.equals(f1)){
            System.out.println("Введите ваш курс");
            String kur = scan.next();
            if(kur.equals(k1)){
                System.out.println("Факультет: " + f1 + "," + "\nкурс: " + k1);
            } else if (kur.equals(k2)){
                System.out.println("Факультет: " + f1 + "," + "\nкурс: " + k2);
            } else if (kur.equals(k3)){
                System.out.println("Факультет: " + f1 + "," + "\nкурс: " + k3);
            }else {
                System.out.println("Введите соответствующий курс в письменном виде");
            }
        }else if (fac.equals(f2)) {
            System.out.println("Введите ваш курс");
            String kur = scan.next();
            if (kur.equals(k1)) {
                System.out.println("Факультет: " + f2 + "," + "\nкурс: " + k1);
            } else if (kur.equals(k2)) {
                System.out.println("Факультет: " + f2 + "," + "\nкурс: " + k2);
            } else if (kur.equals(k3)) {
                System.out.println("Факультет: " + f2 + "," + "\nкурс: " + k3);
            } else {
                System.out.println("Введите соответствующий курс в письменном виде");
            }
        }else{
            System.out.println("Введите факультет \"Экономический\" или \"Юридический\"");
        }
    }
}
