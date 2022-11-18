package day1.one;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class target {
    /**
     * Given an array of integers nums and an integer target, return a list of all pairs of numbers that sum  to target
     * For example: nums = {2, 4, 4, 6, 8} target = 8
     * Return {[2, 6], [4, 4]}
     *
     * nums = {2, 4, 6, 8}
     * Return {[2, 6]}
     */

    public static ArrayList<int[]> targ(int [] nums, int target){

        ArrayList<int[]> ourList = new ArrayList<>();

        Hashtable <Integer,Integer> finsSomething = new Hashtable<>();
        for (int i = 0; i < nums.length; i++){


            if (!finsSomething.contains(nums[i])){
                finsSomething.put(nums[i],i ); // 2

                int different = target - nums[i]; // * - 2 = 8
//                System.out.println("different" + different);
//                System.out.println("nums[i]" + nums[i]);

                int[] temp = {different, nums[i]};
                System.out.println("[" + temp[0] + "," + nums[i] + "]");
                ourList.add(temp);
                continue;


            }





        }
       return  ourList;

    }








    public static void main(String[] args) {
      int []  nums = {2, 4, 4, 6, 8} ;
        int target = 8;
        targ(nums, target);
    }
}
