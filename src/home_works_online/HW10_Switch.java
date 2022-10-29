package home_works_online;

import java.util.Scanner;

public class HW10_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш квартал!");

//        1-вариант

//        int num = scan.nextInt();
//        if (num == 1){
//            System.out.println("Первый квартал");
//        } else if (num == 2) {
//            System.out.println("Второй квартал");
//        }else if (num == 3){
//            System.out.println("Третий квартал");
//        }else if (num == 4) {
//            System.out.println("Четвёртый квартал");
//        }else {
//            System.out.println("В году есть 4 квартала");
//        }



//        2-вариант

//        int num = scan.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("Первый квартал");
//                break;
//            case 2:
//                System.out.println("Второй квартал");
//                break;
//            case 3:
//                System.out.println("Третий квартал");
//                break;
//            case 4:
//                System.out.println("Четвёртый квартал");
//                break;
//            default:
//                System.out.println("В году есть 4 квартала");
//        }


//         3-вариант

        String kv = scan.nextLine();
        switch (kv){
            case "1":
                kv = "Первый квартал";
                break;
            case "2":
                kv = "Второй квартал";
                break;
            case "3":
                kv = "Третий квартал";
                break;
            case "4":
                kv ="Четвёртый квартал";
                break;
            default:
                System.out.println("В году есть 4 квартала");
        }
        System.out.println(kv);
    }
}
