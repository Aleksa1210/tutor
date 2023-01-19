package day1.Homework;

import java.util.ArrayList;

public class H_26 {
    public static void main(String[] args) {


        /*
        1. (Easy) Given a string and a character, return the index of the first time the character is found in the string. (If no character is in word, return -1)
        For example:
        String word = "kisses"
        char letter = 's'
        output should be 2 because s appears at index 2 the last time
         */
        String word = "kisses";
        char letter = 's';
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter){
                System.out.println("First kisses - " + i + word.charAt(i));
                break;
            }
        }




        /*
        2. (Hard) Given a string and a character, return the index of the last time the character is found in the string. (If no character is in word, return -1)
        For example:
        String word = "kissesn"
        char letter = 'n'
        output should be 5 because s appears at index 5 the last time
         */


        String word2 = "kisses";
        char letter2 = 's';
        for (int i = word2.length() -1; i > 0 ; i--) {
            if (word.charAt(i) == letter){
                System.out.println("Second kisses - " + i + word2.charAt(i));
                break;
            }
        }



        /*
        3. (Easy) Given integer a and integer b, return true if b is a factor of a. (This mean a divide by b perfectly, no remainder)
        For example:
        int a = 60
        int b = 12
        output should be true because 60/12 = 5
        int a = 12
        int b = 5
        output should be false because 12/5 = 2.4
        */



        int a = 12; // 60
        int b = 5;  // 12

        if (a % b == 0){
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        System.out.println("-----------------------");

        /* 4. (Hard) Given integer a and integer b, return an integer array of all numbers from 1 through a, including a, that contains b as a factor.
        For example:
        int a = 10
        int b = 2
        output should be {2, 4, 6, 8, 10}  */


        int c = 10;
        int d = 2;
        ArrayList <Integer> temp = new ArrayList<>();
        String s = Integer.toString(c);

        for (int i = 2; i < s.length(); i++) {
            System.out.println();
            System.out.println(s.charAt(i));
            if (c % d == 0 ){

            }



        }









    }

}
