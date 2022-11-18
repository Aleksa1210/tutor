package day1.Homework;

import day1.one.target;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class H_4 {
    /*
    Given a list of nums and a target, return the first subarray of size 3 that sums to target.
    For example:
    If nums = {2,0,1,2,3,1,2,3} and target = 6
    The answers is {1,2,3}  (it is a subarray with 3 elements that sum to day1.one.target) */

    public static void subArrayL(ArrayList<Integer> nums, Integer target){

        ArrayList<Integer> empty = new ArrayList<>();
        Integer sum = 0;
        Integer left = 0;


        // check if the nums size is >= 3, if not return false
        // total = sum(first three numbers)
        // in your for-loop, traverse all  the numbers after the first 3
        // in the body of your for-loop, add a number and remove the first number in your window
        // then check the sum and if it's equal, return the array (empty)

        for (int i = 0; i < nums.size(); i++) {  // 2,0,1,2,3,1,2,3
                                                 // 0 1 2 3 4 5 6 7 index
            empty.add(nums.get(i));
            sum += nums.get(i);
            System.out.println(empty.toString());
            if (sum == target) {
                System.out.println(empty);
                System.out.println("first subarray of size 3");
                break;
            } else if (empty.size() > 2 || sum > target) { // empty = {2,0,1} left = 0 sum = 3
                empty.remove(0); // empty.remove(1), empty = {2,1}
                sum -= nums.get(left);
                left++;
            }

        }

        System.out.println(empty);









    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,0,1,2,3,1,2,3));
       Integer target = 6;
       subArrayL(nums, target);
    }
}
