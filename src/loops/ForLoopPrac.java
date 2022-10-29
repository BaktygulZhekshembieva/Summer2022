package loops;

public class ForLoopPrac {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++){
            System.out.println(i);
        } //0 1 2 3

//        for (int i = 0; i <= 8; i--){
//            System.out.println(i);
//        } //бесконечность

        for (int i = 0; i <= 8; i++){
            System.out.println(i);
        } //0 1 2 3 4 5 6 7 8

//        for (;;){
//            System.out.println("123...");
//        } //бесконечность

        int i = 4;
        for (; i <= 7; i++){
            System.out.println(i);
        } // 4 5 6 7

        for (int k = 2; k <= 4; k++){
            System.out.println(i);
        } // 8 8 8 (вывод i три раза т.k k выпол 3 цикла)

//        for (int j = 8; j > 3; j++){
//            System.out.println("console");
//        }//бесконечность

        for (int j = 8; j > 3; j--){
            System.out.println(j + " console");
        } // 5  раза console

        for (int l = 3; l >=9; l++){
            System.out.println(l);
        } // пусто т.к условие false 3 > 9

        for (int c = 2; c >= -5;){
            System.out.println(c + " java");
            --c;
        } // 2 1 0 -1 -2 -3 -4 -5
    }
}
