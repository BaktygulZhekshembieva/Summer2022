package arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

//        StringBuilder sb1 = new StringBuilder("Hello");
//        StringBuilder sb2 = new StringBuilder("Hello");
//        System.out.println(sb1 == sb2);
//
//        System.out.println(sb1.hashCode()); //1163157884
//        System.out.println(sb2.hashCode()); //1956725890
//        hash code - уникальный код каждого объекта


//        int num1 = 34; // peremennie
//        int [] num2 = new int[2]; // object
//        num2[0] = 23;
//        num2[1] = 56;
//        System.out.println(num2[1]); // 56
//        System.out.println(num2[0]); // 23
//        System.out.println(num2); //[I@1b6d3586 --> hash code
//        System.out.println(Arrays.toString(num2)); //[23, 56]

//        int [] num3 = new int[3]; // object
//        num3[0] = 45;
//        num3[1] = 55;
//        System.out.println(num3[1]); // 55
//        System.out.println(num3[0]); // 45
//        System.out.println(num3); //[I@1b6d3586 --> hash code
//        System.out.println(Arrays.toString(num3)); //[45, 55, 0]

//        int [] num3 = new int[3]; // object
//        num3[0] = 45;
//        num3[1] = 55;
//        num3[2] = 90;
//        System.out.println(Arrays.toString(num3)); //[45, 55, 90]

//        int [] num3 = new int[3]; // object
//        num3[0] = 45;
//        num3[1] = 55;
//        num3[2] = 90;
//        num3[1] = 100;
//        System.out.println(Arrays.toString(num3)); //[45, 100, 90]
//        System.out.println(num3[2]); //90
//        System.out.println(num3[1]); //100
//        System.out.println(num3[4]); //Exception in thread "main" java.lang

        //korotnkyi put'
//        int[] num4 = new int[]{65, 29, 98, 12}; // 1 sposob
//        int[] num6 = {65, 29, 98, 12};          // 2 sposob
//        System.out.println(Arrays.toString(num4));
//        System.out.println(num4[3]);
//
//        int[] num5 = new int[1];
//
//        String [] str = new String[]{"dds", "dsd"};
//        String [] str1 = {"dds", "dsd"};
//        System.out.println(Arrays.toString(str));
//        System.out.println(str[0]);
//
//        boolean [] bool = new boolean[]{true, true, false};

//        byte[] num7 = {127, 65,89, 0, 65};
//        System.out.println(Arrays.toString(num7));
//        Arrays.sort(num7);
//        System.out.println(Arrays.toString(num7));
//
//        Integer number = 67;
//        number.hashCode();

//        Arrays.toString() - переводит в стринг
//        Arrays.sort(число) - сортирует по увелечинии
//        Arrays.sort(char) - сортирует по Ascii table
//        Arrays.binarySearch(name, 'char') - вернет индекс указанного символа, после сортировки массива

        char[] word = {'m', '*', '8', 'j','-', '5', 'f', ' ', 'g', '7'};
        System.out.println(word[3]);
        System.out.println(Arrays.toString(word));
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        System.out.println(Arrays.binarySearch(word,'*'));
    }


}
