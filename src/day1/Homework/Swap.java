package day1.Homework;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        Integer [] num = {4,7,24,75,4,35,-9,1,57,24,96};

        for (int i = 1; i < num.length; i++) {


            for (int j = 0; j < num.length -1; j++) {


                if (num[j] > num[j+1]){
                    num = swap(num,j,(j+1));


                }



            }

            System.out.println(Arrays.asList(num));
        }








    }

    public static Integer [] swap (Integer [] nums, int i, int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }


}
