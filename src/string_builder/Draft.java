package string_builder;

import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {

        System.out.println(rev());

        System.out.println("Введите слово");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(rr(word));

        Draft obj = new Draft();
        System.out.println(obj.sum(1,3));
    }
    public static StringBuilder rev(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        return sb.reverse();
    }

    public static String rr (String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
     int sum (int num1,int num2){
        return num1 + num2;
     }
}
