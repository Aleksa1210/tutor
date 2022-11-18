package day1.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class kadane {
    /*
    Dynamic Subarray Problems
    Find the subarray of any size that will sum to target
    {2,4,1,5,3,2} target = 9
    int index = 0
    sum = 12 - nums[index]
    index ++
    sum = 10 - nums[index]
    index ++
    sum = 6

    If the current sum of the window is less than target, add the next element
    If the current sum of the window is more than target, remove the element in the front
    If the current sum of the window is equal to target,  return the subarray

    Hint: Use pointers
     */

    public static void dynamicSubarray(int [] k, int target ){
        int left = 0;
        int total = 0;
        Set<Integer> curr_window = new HashSet<Integer>();

        for (int right = 0 ; right < k.length; right++){ // {2,4,1,5,3,2} target = 9
            total += k[right]; // 2
            curr_window.add(k[right]);
            System.out.println(curr_window);
            if (total < target) { // 9
                continue;
            }
            else if (total == target) {
                break;
            }
            else {
                while (total > target) { // 12 > 9
                    total -= k[left]; // 12 -  2 = 10
                    curr_window.remove(k[left]);
                    left++; // left = 1
                }
            }
        }
    }




    public static void main(String[] args) {

        int [] numbers = {2,4,1,5,3,2};
        dynamicSubarray(numbers, 9);
    }

    /*
    Kadane's Algorithm
    Find the subarray of size 2 with maximum sum.
    {-12, 0, 12, 8, -5}
     */
}
