package day1.Homework;

import java.util.ArrayList;

public class H_16 {
    public static void main(String[] args) {

        /*
        Given two int variables: number and skip.
        Your program will print the sum of all numbers between 1 up to number, inclusively.
        It will not include any numbers that a multiple of skip.

        For example:
        If number = 5 and skip = 2
        Answer is 9 (1 + 3 + 5)

        If number = 7 and skip = 3
        Answer is  (1 + 2 + 4 + 5 + 7)
        */

        int num = 5;
        int skip = 3;
        int sum = 0;

//        for (int i = 1; i <= num; i++) {
//            if (i % 2 != 0 ){
//                sum += i;
//            } else {
//                continue;
//            }
//            System.out.println(sum);
//        }


        // we can use the variable skip instead of hard-coding 2 and 3
        //  now you can change the value for num and skip instead of creating new for-loops each time
        for (int i = 1; i <= num; i++) { // (1 + 2 + 4 + 5 + 7)
            if (i % skip != 0 ){
                sum += i;
            }
        }
        System.out.println(sum);


        /*
        Given an int number. Return all minimum factors. Factors is an array.

        For example:
        number = 12
        factors: 2, 2, 3
         */

        int number = 12;
        int temp = 2;
        ArrayList<Integer> factors = new ArrayList<>();

        while (number > 1){ // 12 > 1 true, 6 > 1 true, 3 > 1 true
            if (number % temp == 0){ // 12 % 2 == 0 true, 6 % 2 == 0 true, 3 % 2 == 0 false
                factors.add(temp); // factors  = {2}, factors = {2,2}
                number /= temp; // 12 = 12 / 2 -> 6, 6 / 2 -> 3,
            }
            else {temp++;} //temp  = 3
        }
        System.out.println(factors.toString());








    }
}
