import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println(result);
        }catch (Exception i){
            System.out.println("OOOPS!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter index");
        int index = scanner.nextInt();

        try {
            int[] nums = new int[3];
            System.out.println(nums[index]);
        }catch (Exception e){
            System.out.println("wrong index");
        }
    }
}
