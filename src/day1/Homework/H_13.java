package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class H_13 {
    public static void main(String[] args) {

        int [] num = {0,9,1,5};
        for (int i = num.length - 1; i >= 0 ; i--) {

            System.out.print(num[i]);
        }
        System.out.println("---------------");

        int [] nums = {5,2,7,3, 7};
        int max= 0; // 7
        int globalMax = 0;
        int maxIndex= 0;
        int secondMax = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max){
                max = nums[j];
                maxIndex = j;
            //    globalMax = nums[j]; 2 ways
            }
        }
        max = 0; // 0
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max && i != maxIndex){
                secondMax = nums [i];
            }


        }
        System.out.print("Max" + nums[maxIndex]);
     //   System.out.println(globalMax); 2 ways
        System.out.println("Second max" + secondMax);



    }
}
