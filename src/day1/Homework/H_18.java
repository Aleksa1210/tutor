package day1.Homework;

public class H_18 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 3; j > 0; j--){
                System.out.print(i + j);
            }
        }
        /*
        one step outer loop, all steps inner loop

        i = 0
            j = 3
            print (3)

            j = 2
            print (2)

            j = 1
            print (1)

        i = 1

         */

        // Given two integers, rows and cols. You are going to use a nested for-loop and print a block of * based on rows and cols.
        // For example:
        // Input:
        // rows = 2, cols = 3

        // Output:
        // ***
        // ***

        System.out.println("-------------");

        int rows = 2;
        int cols = 3;

        for (int i = 0; i < rows; i++) { // rows = 2.... i = 0, 1  condition: i < rows
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
        }

        System.out.println("------");

        // Given an array of ints, you need to return true if there are two numbers that can add to a target
        // For example
        // int[] nums = {2,3,4} target = 6
        // Output: True
        int[] nums = {2,3,4};
        int target = 6;

        int temp = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++){  // i = 0

            for (int j = 0; j < nums.length; j++) { // j = 0, 1, 2

                if ((nums[i] + nums[j] == target) && i != j){ //  if 2 + 4 == 6 && 0 != 2
                    System.out.println("first value" + nums[i]);
                    System.out.println("second value" + nums[j]);
                    break;
                }
            }
        }


    }

}
