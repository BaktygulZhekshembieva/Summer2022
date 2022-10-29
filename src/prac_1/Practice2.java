package prac_1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice2 {
    public static void main(String[] args) {

        // Delete duplicates Words in String
        String duplicateWords = "I like coding coding every morning";
        System.out.println(deleteDublicateWords(duplicateWords));

        // Find the sum of number in String
        String findSum = "Hello 1 World 2 I 3 am 4 John";
        System.out.println(intFindSum(findSum));

        // Sum of Digits of a Number
        int numbers = 12345;
        System.out.println(sumOfDigits(numbers));

        //Find factorial number 5 --> 5*4 * 3 * 2 * 1 = 120
        int num = 5;
        System.out.println(factor(num));

        System.out.println(recrution(6));


    }

    public static String deleteDublicateWords(String str) {
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        String[] word = str.split(" ");
        lSet.addAll(Arrays.asList(word));
        String str2 = "";
        for (String dubl : lSet) {
            str2 = str2.concat(dubl + " ");
        }
        return str2;
    }

    public static int intFindSum(String str) {
        char[] chars = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                int a = Integer.parseInt(String.valueOf(chars[i]));
                sum = sum + a;
            }
        }
        return sum;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        char ch;
        int n;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                n = Character.getNumericValue(ch);
                sum += n;
            }
        }
        return sum;
    }

    public static int sumOfDigits(int num) {
        int digit;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    static public int sumOfDigits1(int nums){
        Integer inte = nums;
        String str = inte.toString();
        char[] c = str.toCharArray();
        int sum = 0;
        for (int i = 0;i<c.length;i++){
            sum = sum+Character.getNumericValue(c[i]);
        }
        System.out.println(Arrays.toString(c));
        return sum;
    }

    public static int factor(int num){
        int f = 1;
        for (int i = 1; i <= num; i++){
            f = f * i;
        }
        return f;
    }

    static int recrution(int num){
        if (num == 1) {
            return 1;
        } else {
            return num * recrution(num - 1);
        }
    }

    public static void recursionFucn() {
        System.out.println("Привет, JavaRush!");
        recursionFucn();
    }
}
