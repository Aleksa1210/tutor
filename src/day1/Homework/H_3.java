package day1.Homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class H_3 {
    /*
    Given a list of nums and a target, return the number of subarrays that sum to target.
For example:
If nums = {2,4,1,6,1,0,7,9,3} and target = 7
The answer is 4 because {{2,4,1}, {1,6}, {6,1}, {0,7}, {7}}
     */

    public static void subarrays (ArrayList<Integer> num, Integer target) {
        ArrayList<Integer> pars = new ArrayList<>();
        Integer total = 0;
        Integer left = 0;
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        // {2,4,1,6,1,0,7,9,3}

        // pair = 2,4, 1
        // total = 7
        for (int right = 0; right < num.size(); right++) {
            pars.add(num.get(right));
            total += num.get(right);

            while (total > target) {
                pars.remove(num.get(left));
                total -= num.get(left);
                left++;
            }
            while (total == target) {
                ArrayList<Integer> temp = new ArrayList<>(pars);
                all.add(temp);
                pars.remove(num.get(left));
                total -= num.get(left);
                left++;
            }
        }
        System.out.println(all.toString());
    }



    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>(Arrays.asList(2,4,1,6,1,0,7,9,3));
        Integer target = 7;
        subarrays(num, target);
    }
}
