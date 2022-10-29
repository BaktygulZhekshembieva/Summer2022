package home_works_online;

import java.util.Arrays;

public class HW22_Arrays {
    public static void main(String[] args) {

        int[][] nums = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[1];
        nums[2] = new int[4];

        nums[0][0] = 14;
        nums[0][1] = 15;

        nums[1][0] = 20;

        nums[2][0] = 35;
        nums[2][1] = 36;
        nums[2][2] = 38;
        nums[2][3] = 39;

// 1-loop
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println("________________");

// 2-loop
//        for (int i [] : nums) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//            }


        String [][] names = {{"Alex", "Mell", "Gloria"}, {"Tom", "Jerry"}, {"Masha"}};

// 1-loop
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("________________");

// 2-loop
        for (String [] i: names) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}