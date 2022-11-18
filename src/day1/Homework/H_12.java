package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class H_12 {
    public static void main(String[] args) {


        Integer [] num = {4,7,24,75,4,35,-9,1,57,24,96};
        Set<Integer> notDupl = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            notDupl.add(num[i]);
        }
        System.out.println(notDupl);



        Character [] let = {'a','s','a','d','e'};
        String dup = "ajhkaaaj";
        String empty = "";

        for (int i = 0; i < dup.length(); i++) {

            if (!empty.contains(String.valueOf(dup.charAt(i)))){
                empty += String.valueOf(dup.charAt(i));

            }


        }
        System.out.println(empty);



      //  num = (Integer[]) Set.of(notDupl).toArray();
        // nums = {3,5,2,6}

        for (int k = 1; k < num.length; k++) { // {4,7,24,75,4,35,-9,1,57,24,96};

            for (int j = 0; j < num.length-1; j++) {
                if (num[j] > num[j+1]){
                    // num = swap(num,j,j+1);
                    int temp = num[j]; // temp = 3
                    num[j] = num[j+1]; // nums[0] = 10... nums = {10,10,4,6}
                    num[j+1] = temp;

                }

            }

        }
        // {4, 6, 5, 6, 4, 7}

        System.out.println(Arrays.toString(num));


    }
    public static Integer[] swap(Integer [] nums, int i, int j){ // nums = {3,10,4,6}  i = 0 and j = 1, output => {4,3,6}
        int temp = nums[i]; // temp = 3
        nums[i] = nums[j]; // nums[0] = 10... nums = {10,10,4,6}
        nums[j] = temp;  // nums[1] = 3... nums = {10,3,4,6}
        return nums;

        
    }
}
