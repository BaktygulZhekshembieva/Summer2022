package arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {

        int nums [][] = new int[2][3];
        nums[0][0] = 23;
        nums[0][1] = 67;
        nums[0][2] = 63;

        nums[1][0] = 100;
        nums[1][1] = 897;
        nums[1][2] = 546;

        System.out.println(Arrays.deepToString(nums));
        //         0               1
        // [  [23, 67, 63], [100, 897, 546]  ]
        //      0   1   2     0    1    2

        System.out.println(nums[1][2]); // 546

        Arrays.sort(nums[0]);
        System.out.println(Arrays.toString(nums[0])); // [23, 63, 67]

        System.out.println(Arrays.deepToString(nums)); // [[23, 63, 67], [100, 897, 546]]


//        for ( int i = 0; i < nums[1].length; i++){
//            System.out.println(i + " Hello");
//        }

        //как взять из многомерного массива одномерный массив:

        int[] num3 = {nums[0][0], nums[0][1],nums[0][2]}; // [23, 63, 67]
        System.out.println(Arrays.toString(num3));

        int [] nums2 = nums[0]; // короткий путь. синтаксический сахар
        System.out.println(Arrays.toString(nums2)); // [23, 63, 67]

        // виды создания
//        int [] nums5 = new  int[3];
//        int [] nums6 = new int[]{23,78,45};
//        int [] nums7 = {78,23,10};


        int[][] vb = {nums[0], {}};
        System.out.println(Arrays.deepToString(vb)); // [[23, 63, 67], []]
        System.out.println(vb[0][1]);                // 63
//        System.out.println("----->>> " + vb[1][0]); // error

//        int [][] nums4 = { {10, 20, 30} , {70,80,90} };
//        //               [ [10, 20, 30] , [70, 80, 90] ]
//        System.out.println(Arrays.deepToString(nums4));

//                                              {   0   }
//        int [][] nums8 = new int[1][2]; // { { 200, 300}}
//        //                                      0    1
//        nums8[0][0] = 200;
//        nums8[0][1] = 300;
//        System.out.println(Arrays.deepToString(nums8)); // [[200, 300]]
//        System.out.println(nums8[0][1]); // 300
//        System.out.println(nums8[1][1]); // error

        int [][] nums9 = new int[1][1]; // { {78} } // длина нач-ся с 1
        nums9[0][0] = 78;                           // индекс нач-ся с 0
        System.out.println(Arrays.deepToString(nums9));



        //           0                  1
        // [   [23, 67, 63]  ,  [100, 897, 546]   ]
        //      0   1   2         0    1    2

        //                       0             1
        int [][] years = { {1999, 1984}};
        //                    0     1       0     1
        System.out.println(Arrays.deepToString(years)); // [[1999, 1984]]
        System.out.println(years[0][0]); // 1999

        int [][] age = new int[3][];
        age[0] = new int [3];
        age[1] = new int[2];
        age[2] = new int[4];
        age[0][0] = 12;
        age[2][0] = 39;

        //                      0           1             2
        int [][] ages = { {12, 15, 10}, {18, 20}, {39, 67, 59, 36} };
        //                 0    1   3    0    1    0    1   2   3

        System.out.println(ages[2][3]); // 36
        System.out.println(ages[1][0]); // 18
        System.out.println(ages[0][0]); //12
        System.out.println(ages[0][2]); // 10
        System.out.println("_____________");

        //              0 < 3
        for (int i = 0; i < ages.length; i++){
            // 0 внешний цикл -> {12, 15, 10}
            //                внутренние циклы
            //               0 < ages[0].length = 12
            //               0 < ages[1].length = 15
            //               0 < ages[2].length = 10
            // 1 внешний цикл -> {18, 20}
            //               1 < ages[0].length = 18
            //               1 < ages[1].length = 20
            // 2 внешний цикл ->  {39, 67, 59, 36}
            //               2 < ages[0].length = 39
            //               2 < ages[1].length = 67
            //               2 < ages[2].length = 59
            //               2 < ages[3].length = 36
            for (int j = 0; j < ages[i].length; j++){
                System.out.print(ages[i][j] + " ");
            }
            System.out.println("\n- - - - ");
        }

        int ages2 [][] = {{12,23,45}, {67,90}, {23}, {90,16,82,34,87}};
    }
}
