package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class H_25 {
    public static void main(String[] args) {


        int[] input = {1, 4, 2, 0};
        int[] tem = new int[input.length];
        //Output = {1,4,2,0,2,8,4,0}

        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            tem[i] = input[i] + input[i];
            all.add(input[i]); // {1 4
            //all.add(tem[i]); {1, 2, 4, 8
        }
        for (int num : tem) {
            all.add(num);
        }

        System.out.print("all" + all);
        //System.out.println(all + Arrays.toString(tem));

        System.out.println("===========================");


        String input2 = "abc";
        int[] count = {4, 2, 3};

//        //Output: “aaaabbccc” [4,2,7]
        String ret = "";
        for (int i = 0; i < input2.length(); i++) {

            ret += (input2.charAt(i) + "").repeat(count[i]);

        }
        System.out.println("abc - " + ret);

        System.out.println("===========================");


        String in = "apple pie";
        Character a = 'p';
        String b = "pie";
        if (in.contains(b)) {
            System.out.println("true - pie");

        } else {
            System.out.println("false - pie");
        }





        System.out.println( "apple pie contains p: " + customContains(in, a) );
        System.out.println( "friends contains r: " + customContains("friends", 'r') );

        int [] numbers = {2,4,7,1,5,0,2};
        System.out.println("SumOfOdds" + sumOfOdds(numbers));


        System.out.println(returnChar("emma"));





    }

    public static boolean customContains(String phrase, Character letter){
        for (int i = 0; i < phrase.length(); i++) { // i = 0, 1
            if (phrase.charAt(i) == letter){  // false
                return true;
            }
        }
        return false;
    }

    /*
    The following code is intended to add all the odd numbers in the list
    There is a problem in the code, try to follow along and think like
    a computer

    Example:
    nums = [2,4,7,1,5,0,2]
    output 7 + 1 + 5 = 13
     */



    public static int sumOfOdds(int [] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                count += nums[i];

            }
        }
        return count;
    }

    /*
    Given a string, return the letter which is the first repeat.

    For example:
    String name = "Emma"
    output is m

    String word = 'lollllol'
    output is l
     */

    public static Character returnChar(String name){ // name = "name" i = 3

        for (int i = 0; i < name.length() - 1; i++) {

            if (name.charAt(i) == name.charAt(i+1)){ // e == name.charAt(4) -> indexOutOfRange
                return name.charAt(i);

            }

        }


        return '0';

    }





}
