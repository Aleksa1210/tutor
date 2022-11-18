package day1.Homework;

import java.util.Arrays;

public class H_1 {


    /*Given an array of integers `nums`, return a subarray of size 2 with the minimum sum.
    For example, if nums = [3,4,2,6,1,4]
    The output should be [1,4] */

    public static void subArray (int [] num){

        int [] size2 = new int[2];
        int temp = 100;

        for (int i = 0; i < num.length -1; i++){  //[3,4,2,6,1,4]
            if (num[i] + num[i+1] < temp){ // 6
                temp = num[i] + num[i+1]; //6
                size2[0] = num[i]; // 4
                size2[1] = num[i+1]; // 2
            }
//            System.out.println(size2[0]);
//            System.out.println(size2[1]);

        }
        System.out.println("Index of" + Arrays.toString(size2));
    }


    public static void main(String[] args) {

        int [] nums = {3,4,2,6,1,4};
        subArray(nums);


    }
}
