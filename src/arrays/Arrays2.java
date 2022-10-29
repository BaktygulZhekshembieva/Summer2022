package arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        int[] num = {12, 67, 2, 0, 8};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num)); // [0, 2, 8, 12, 67]
        System.out.println(Arrays.binarySearch(num, 8)); // 2

        String capitals[] = {"London", "Rome", "Bishkek", "Berlin", "Karakol", "Beijing"};
        System.out.println(Arrays.toString(capitals));
        Arrays.sort(capitals);
        System.out.println(Arrays.toString(capitals));
        //      0       1        2       3        4      5
        // [Beijing, Berlin, Bishkek, Karakol, London, Rome]
        //            "Karakol"
        capitals[5] = capitals[3]; // capitals[5] = "Karakol";
        // [Beijing, Berlin, Bishkek, Karakol, London, Karakol]
        capitals[3] = "Rome";
        // [Beijing, Berlin, Bishkek, Karakol, London, Rome]
        System.out.println(Arrays.toString(capitals));
        // [Beijing, Berlin, Bishkek, Rome, London, Karakol]
        capitals[3] = capitals[5];
//        [Beijing, Berlin, Bishkek, Karakol, London, Karakol]

        int nums[] = new int[3];
        nums[0] = 45;
        nums[1] = 90;
        nums[2] = 56;
        System.out.println(nums); // [I@1b6d3586

        boolean bool[] = new boolean[3];
        bool[0] = true;
        bool[1] = false;
        bool[2] = true;
        System.out.println(bool); // [Z@4554617c

        // 'm'  'o'  'l'  'o'  'k'  'o'

        double digits[] = new double[7];
        digits[5] = 24;
        digits[1] = 89;
        digits[3] = 28;
        //   0     1    2    3     4     5    6
        // [0.0, 89.0, 0.0, 28.0, 0.0, 24.0, 0.0]
        //    1    2    3    4     5     6    7
        System.out.println(Arrays.toString(digits));

        char[] mark = new char[4];
        mark[0] = 'a';
        mark[1] = 'c';
        mark[2] = 'e';
        mark[3] = 'r';
        System.out.println(mark); // acer --> выйдет стринг. Стринг это последовательность символов
        System.out.println(mark.length); // 4
        System.out.println(mark[3]); // r

        System.out.println("__________");

        for (int i = 0; i < mark.length; i++) {  // 1 <= 4 --> 1 2 3 4
            System.out.print(mark[i]); // acer
            // 0 -> mark[i] = 'a';
            // 1 -> mark[i] = 'c';
            // 2 -> mark[i] = 'e';
            // 3 -> mark[i] = 'r';
        }

        System.out.println(); // пусто
        System.out.println("______________");


        for (char i : mark) {
            System.out.print(i); // acer
            // char i = 'a';
            // char i = 'c';
            // char i = 'e';
            // char i = 'r';
        }
        System.out.println(); //пусто

        Arrays2 object = new Arrays2();
//      String [] names = {"John", "Will", "Tim"}; // под капотом видит это
        System.out.println(Arrays.toString(object.getNames("John", "Will", "Tim"))); //[John, Will, Tim]

        System.out.println(object.getSymbol(mark)); // a --> метод вернуть 0 индекс

        System.out.println(object.getSymbol(new char[]{'L', 'G'}));  // L --> anonymous array
        // созданный в массиве наз-ся анонимный массив

        int year[] = {1999, 2038, 1879, 2000, 2005};
        System.out.println(Arrays.toString(year)); // [1999, 2038, 1879, 2000, 2005]

        for (int i : year) {
            System.out.print(i + ", "); // 1999, 2038, 1879, 2000, 2005,
        }

        int[] year1 = new int[6];
        year1[0] = 2022;
        year1[1] = 2023;
        year1[2] = 2024;
        year1[3] = 2025;
        year1[4] = 2026;
        year1[5] = 2027;
        System.out.println(Arrays.toString(year1));
        year1[3] = 'a';
        System.out.println(year1[3]);
        Arrays.sort(year1);
        System.out.println(Arrays.toString(year1));
        System.out.println(Arrays.binarySearch(year1, 2026));

        for (int i : year1) {
            System.out.print(i + ", ");
        }
    }
            public String[] getNames (String name1, String name2, String name3){
                String[] names = {name1, name2, name3};
                return names;
            }

            public char getSymbol ( char[] symbols){
                return symbols[0];
            }
}