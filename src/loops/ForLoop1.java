package loops;

public class ForLoop1 {
    public static void main(String[] args) {

        //           1   <= 10
        for (int i = 7; i <= 10; i++) {
            System.out.println(i);
        } // 7 8 9 10

        System.out.println("__________________");

        for (int i = -6; i <= -2; i += 2) {
            System.out.println(i);
        }

        // -6
        // -4
        // -2

        System.out.println("_______________");
        int i;
        for (i = 3; i <= 6; ++i) {
            System.out.println(" -->" + i);
            // -->3
            // -->4
            // -->5
            // -->6
        }

        System.out.println(i); //7

        System.out.println("_______________");

        for (int c = 1; c <= 10; c++) {
            //                 7 + 2
            System.out.println(i + 2); // 9 --> 10 раз повтор
        }

        for (int k = 1; k <= 5; k++) {
            System.out.println(k + "  Hello world!");
        }
        //  1  Hello world!
        //  2  Hello world!
        //  3  Hello world!
        //  4  Hello world!
        //  5  Hello world!

        System.out.println("Good morning"); //Good morning

        int ageForID = 16;
        int jimsAge = 78, katesAge = 45, johnAhe = 56, roseAge = 14;
        //        78 >= 16
         if (jimsAge >= ageForID){
         System.out.println("Get a passport");
    } // Get a passport


        int j = 2;
         for (; j <= 5; j++){
             System.out.println(j + " Aloha");
         }
        //        2 Aloha
        //        3 Aloha
        //        4 Aloha
        //        5 Aloha

         int l = 1;
         for (; l <= 3;){
             System.out.println(l + " London is a capital of Britain");
             l++;
         }
//        1 London is a capital of Britain
//        2 London is a capital of Britain
//        3 London is a capital of Britain
        int k =1;
        for (; k <= 3;){
            k++;
            System.out.println(k + " London is a capital of Britain");
        }
//        2 London is a capital of Britain
//        3 London is a capital of Britain
//        4 London is a capital of Britain
    }
}