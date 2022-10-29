package home_works_online;

import java.util.Scanner;

public class HW16_NomadExercise {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int m = inp.nextInt();
        StringBuilder sb= new StringBuilder("Nomad");

        for (int i = 1; i < m; i++) {
            sb.insert(2,'m');
                }
        System.out.println(sb);


//        getTheLetter();
//    }
//    public static void getTheLetter() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a number:");
//        int num = scan.nextInt();
//        StringBuilder sb= new StringBuilder("Nomad");
//
//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.charAt(i) == 'm') {
//                for ( int j = 0 ; j < num - 1; j++ ) {
//                    sb.insert(i, 'm');
//                    i++ ;
//                }
//            }
//        }
//        System.out.println(sb);
    }
}
