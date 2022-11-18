package day1.one;

import java.util.*;

public class SubArray_08_24 {
    /*
    Problem 1:
    Subarray is different from subset
    int[] nums = {8,3,4,5};
    Example of subset: {3,5}; is any elements inside  nums no matter the order
    Example of subarray/window: {3,4}, {2,3,4}; the elements need to be touching

    What is the maximum sum of window size of 2? {4,5}

    Constant, Linear, Quadratic, Exponential
    O(1), O(n), O(n^2)...

     */ //int[]

    //Subarray - need to be next to each other
   public static int[] maxSubarray(ArrayList<Integer>  nums){
    int temp_sum = 0;
    int[] space = {0,0};
    for (int i = 0; i < nums.size()-1; i++){ // size - 4 numbers
        if ( (nums.get(i) + nums.get(i+1))  > temp_sum){ // 2 + 3 = 5 > 0
            temp_sum = nums.get(i) + nums.get(i+1); // 2 + 3
            space[0] = nums.get(i);
            space[1] = nums.get(i+1);
        }
    }
    return space;
   }

   public static void main(String[] args) {
       ArrayList<Integer> example1 =  new ArrayList<Integer>();
       example1.add(8);
       example1.add(3);
       example1.add(4);
       example1.add(5);
       // System.out.println(maxSubarray(example1));
       System.out.println(maxSubarray(example1)[0]);
       System.out.println(maxSubarray(example1)[1]);

       int first = findMaxTwo(example1)[0];
       int second = findMaxTwo(example1)[1];
       System.out.println("[" + first + "," + second + "]");
   }

   // [2,4,3,1,9,4]

   public static int[] findMaxTwo(ArrayList<Integer> nums){
       int first_max = 0;
       int second_max = 0;
       for (int i = 0; i < nums.size(); i++){
           if (nums.get(i) > second_max){
               second_max = nums.get(i);
               if (second_max > first_max) {
                   int temp = first_max;
                   first_max = second_max;
                   second_max = temp;
               }
           }
       }
       int[] ret = {first_max, second_max};
       return ret;
   }
}
