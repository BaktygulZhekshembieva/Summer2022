package arrays;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
//        System.out.println("Enter your gender mail and female");
//        String gender = scann.nextLine();
        System.out.println("Enter Surname");
        String surName = scann.next();
        System.out.println("Enter you name:");
        String name = scann.next();
        System.out.println("Enter your Middlename");
        String middleName = scann.next();
        String fio[] = new String[]{surName, name, middleName};
//        1
        if (surName.endsWith("ova") || surName.endsWith("eva")) {
            if (middleName.endsWith("ovna") || middleName.endsWith("evna")) {
                if (surName.substring(0, surName.length() - 3).equals(middleName.substring(0, middleName.length() - 4))) {
                    System.out.println("Однокоренные");
                } else {
                    System.out.println("Однокоренные");
                }
            }
        } else if (surName.endsWith("ov") || surName.endsWith("ev")) {
            if (middleName.endsWith("ovich") || middleName.endsWith("evich")) {
                    if (surName.substring(0, surName.length() - 2).equals(middleName.substring(0, middleName.length() - 5))) {
                        System.out.println("Однокоренные");
                    } else {
                        System.out.println("Не однокоренные");
                    }
            }
        }else {
            System.out.println("Не однокоренные");
        }

//        2
        if ((surName.substring(0,surName.length()-2)).equals((middleName.substring(0,middleName.length()-5)))) {
            System.out.println("Однокоренные");
        } else if ((surName.substring(0,surName.length()-3)).equals((middleName.substring(0,middleName.length()-4)))){
                System.out.println("Однокоренные");
        }else {
            System.out.println("Не однокоренные");
        }
    }
}
