package loops;

public class Do_While {
    public static void main(String[] args) {

//        int n = 3;
//        while (n < 7){
//            System.out.println(n);
//            n++;
//        } //3 4 5 6


//        do {
//            System.out.println(n); //3
//            n++;                   //4
//        }
//        while (n > 7);             //false --> 3


//        do {
//            System.out.println(n); //3
//            n++;                   //4
//        }
//        while (n < 7 );            // 3 4 5 6


//        for (int i = 1; i <= 5 ; i++) {
////            System.out.println(i);
//            if (i == 3){
//                System.out.println(i);
//                break;
//            }
//            System.out.println(i);
//    }

//        for (int i = 1; i <= 5 ; i++) {
//            if (i == 3){
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 5 ; i++) {
//            if (i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }


//        while (n >-2){
//            if ( n == 0){
//                break;
//            }
//            n--;
//            System.out.println(n);
//        }

        int n = 3;
        while (n <= 7){
            n++;
            if ( n == 5){
                continue;
            }
            System.out.println(n);
        }

//        int l = 0;
//        while (l < 10){
//            l++;
//            if ((l % 2) != 0) continue;
//            System.out.println(l);
//        }

//        for (int i =0; i <=7; i++){
//            System.out.println(i);
//        }
    }
}
