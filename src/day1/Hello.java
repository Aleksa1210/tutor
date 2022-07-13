package day1;

import java.lang.reflect.Array;

public class Hello {
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

                       //1,2,5,6     =3
    public static int[] twoSum(int[] nums, int target) {
      int[] a = new int[2];

        for (int i = 0; i < nums.length; i++){  //1,2,3,4,5



            for (int j = 0; j < nums.length; j++){ //1,2,3,4,5


                if ((nums[i] + nums[j] == target) && i != j){
                    a[0] = i;
                    a[1] = j;


                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int target = 7;

        System.out.println(twoSum(nums,target)[0]);
        System.out.println(twoSum(nums,target)[1]);
    }


}
