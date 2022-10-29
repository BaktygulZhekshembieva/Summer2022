package home_works_online;

public class HW17_NestedFor {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

