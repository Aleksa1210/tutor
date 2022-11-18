package day1.one;

import java.util.ArrayList;

public class window_09_07 {

    /*
    Given a list of nums and a target int k, find a subarray (a window) of size 2 that
    sums to target k.
    {4,8,2,6,4,3} k = 10
    returns {8,2}
     */

public static int[] name (int [] nums, int k){

    int [] temp = new int[2];

    for (int i = 0; i < nums.length -1; i++){ // {4,8,2,6,4,3}
        if (nums[i] + nums[i+1] == k){
            temp[0] = nums[i];
            temp[1] = nums[i+1];
        }else {
            continue;
        }

    }
    System.out.println(temp[0] + "," + temp[1]);

return temp;
}


    public static void main(String[] args) {

    int [] target = {4,8,2,6,4,3};
        System.out.println(name(target, 7));


    }

}
