package day1.Homework;

import java.util.Arrays;

public class H_14 {
    public static void main(String[] args) {

        String letter = "bslta";
        char[] charLetter = letter.toString().toCharArray();
        String first = "";
        String second = "";

        System.out.println("a before b is: " + "a".compareTo("b"));
        //System.out.println("testing" + ("a" < "b"));
        System.out.println("b before a is: " + "b".compareTo("a"));
        System.out.println("a before a is: " + "a".compareTo("a"));
        char tempt;


        for (int i = 0; i < letter.length(); i++) {

            for (int j = 0; j < letter.length() -1; j++) {
               first = String.valueOf(charLetter[j]);
              second =String.valueOf(charLetter[j+1]);
                //System.out.println("before: " + Arrays.toString(charLetter));

                if (first.compareTo(second) < 0){ // ab
                    //System.out.println("first: " + first + " comes before second : " + second);
                }
                else if (first.compareTo(second) == 0){ //aa
                    //System.out.println("first: " + first + " is the same as second : " + second);
                }
                else { //ba
                    System.out.println("first: " + first + " comes after second : " + second);
                    tempt = charLetter[j]; //b
                    charLetter[j] = charLetter[j+1];
                    charLetter[j+1] = tempt;

                }
               // System.out.println("after: " + Arrays.toString(charLetter));
            }
        }
        System.out.println(Arrays.toString(charLetter));
        System.out.println(String.valueOf(charLetter));

//        int[] nums = {2,4,3};
//        int temp = nums[1];
//        nums[1] = nums[2];
//        nums[2] = temp;

        String word = "bac";
        char[] word1 = word.toString().toCharArray();

        int index1 = 0;; //b
        int index2 = 2; //a
        word = word.substring(0, index1) + word.charAt(index2) + word.substring(index1 + 1, index2) + word.charAt(index1) + word.substring(index2);
        // word.substring(0, index1) = ""
        // word.charAt(index2) = "a"
        // word.substring(index1, index2) = "bc"




    }
}
