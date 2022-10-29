package arrays;

import java.util.Arrays;

public class Arrr {
    public static void main(String[] args) {




    }
    public static int[] maxEnd(int[] nums) {
        int a [] = {nums [0],nums[0],nums[0]};
        int b [] = {nums[2],nums[2],nums[2]};
        if (nums[0] > nums [2]){
            return a;
        } return b;
    }

    public static int[] maxEnd1(int[] nums) {
        int maxNum = Math.max(nums[0],nums[2]);
        int [] maxNums = {maxNum, maxNum, maxNum};
        return maxNums;
    }

    public int[] makeEnds(int[] nums) {
        int result [] = {nums[0], nums[nums.length-1]};
        return result;
    }

}
