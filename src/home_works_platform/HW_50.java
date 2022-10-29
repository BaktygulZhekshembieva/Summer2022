package home_works_platform;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HW_50 {
    public static void main(String[] args) {

      countVowelsDigits();
    }

    static void countVowelsDigits(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = scanner.nextLine();

        int count1 = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char i : vowels)
            for (char j : str.toLowerCase().toCharArray())
                if (j == i)
                    count1++;

        double percentage1 = (count1 * 100) / str.length();
        String per1 = String.format("%.2f",percentage1);

        System.out.println("Number of vowels: " + count1 + " (" + per1 + "%)" );

        int count2 = 0;
        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char i : nums)
            for (char j : str.toCharArray())
                if (j == i)
                    count2++;

        double percentage2 = (count2 * 100) / str.length();
        String per2 = String.format("%.2f",percentage2);

        System.out.println("Number of digits: " + count2 + " (" + per2 + "%)" );
    }
}
