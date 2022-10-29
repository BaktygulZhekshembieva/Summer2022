package home_works_online;

public class HW16_ForLoop {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i+=2){
            System.out.println(i);
        } //2 4 6 8 10

        System.out.println("____________________");

        for (int i = 2; i <= 6; i++) {
            System.out.println((i - 1) * 2);
        } // 2 4 6 8 10

        System.out.println("____________________");

        for (int i = 1; i <= 12; i +=2) {
            System.out.println((i - 1));
        } //0 2 4 6 8 10

        System.out.println("____________________");

          for (int i = 1; i <= 10; i+=2){
              System.out.println(i);
          } //1 3 5 7 9

        System.out.println("____________________");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } // 2 4 6 8 10 --> это из интернета

    }
}
