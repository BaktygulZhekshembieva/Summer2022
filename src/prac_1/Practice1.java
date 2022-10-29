package prac_1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        //    swap two numbers using a temporary variable
//        int numX = 10;
//        int numY = 20;
//
//        numX = numX + numY; // 30
//        numY= numX - numY; // 10
//        numX = numX - numY; // 20
//        System.out.println(numX);
//        System.out.println(numY);


        // reverse text without StringBuffer class
//        String reverserText = "987654321";
//        System.out.println(reverse(reverserText));

        // Sort Array without method sort
//        int[] numbers = {9, 6, 7, 21, 32, 1, 3, 4, 54};
//        System.out.println(Arrays.toString(sortArray(numbers)));

//        for (int i = 0; i < numbers.length; i++)
//        {      //Loop over java Array  outer Loop use
//            for (int j = i + 1; j < numbers.length; j++)
//            {  // Loop over java array
//                int tmp = 0;                            //tempraory variable in order to compare.
//                if (numbers[i] > numbers[j])
//                {          //compare outer loop object with inner loop
//                    tmp = numbers[i];               // if greater than swapping.
//                    numbers[i] = numbers[j];            // Swaping code here.
//                    numbers[j] = tmp;
//                }
//            }
//        }
//            // After Sorting Printing The Value.............
//
//            for (int i = 0; i < numbers.length; i++)
//        {
//        System.out.println(numbers[i]);
//        }


        // Delete  duplicates numbers in Array
        int[] numbers1 = {9, 6, 7, 21, 32, 1, 3, 4, 54, 9, 4, 6, 1, 3, 4, 54};
        System.out.println(Arrays.toString(deleteDuplicates(numbers1)));

    }

    public static String reverse(String str){
        String num = " ";
        for (int i = str.length()-1; i >= 0; i--){
           num = num + str.charAt(i);
        }
        return num;
    }

    public static int[] sortArray(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int n = i+1; n < a.length; n++){
                int temp = 0;
                if (a[i] > a[n]){
                    temp = a[i];
                    a[i] = a[n];
                    a[n] = temp;
                }
            }
        }
        return a;
    }


    public static int[] deleteDuplicates(int[] nums){
        Set<Integer> s = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        int temp = 0;
        int [] arr = new int[s.size()];
        for (int i : s){
            arr[temp++]=i;
        }
        return arr;
    }


}
