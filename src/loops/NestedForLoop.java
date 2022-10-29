package loops;

public class NestedForLoop {
    public static void main(String[] args) {

//       for (int i = 5; i >=1; i--){
//           System.out.println(i + " Bona");
//       }

//       int num = 5;
//       while (num >= 1){
//           System.out.println(num);
//           num--;
//       } // 5 4 3 2 1

//        int row = 4;
//        for (int i = 1; i <=row ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        StringBuilder str = new StringBuilder("*");
//        System.out.println(str);
//        for (int j = 0; j<4; j++) {
//                System.out.println(str.append(" *"));
//            }


        for (int i = 1; i <= 4; i++){
            for (int j = i; j <= i*2-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
