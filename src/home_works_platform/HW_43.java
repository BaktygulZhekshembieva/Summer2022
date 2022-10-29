package home_works_platform;

public class HW_43 {
    public static void main(String[] args) {

        int mark = 49;
        System.out.println("The mark is " + mark);

        passedOrFailed(mark);
    }

    static void passedOrFailed(int num){
        if (num <= 49) {
            System.out.println("You are failed");
        } else {
            System.out.println("You are passed");
        }
        System.out.println("Bye, bye!");
    }
}

