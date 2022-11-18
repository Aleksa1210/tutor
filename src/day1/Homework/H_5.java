package day1.Homework;

import java.util.stream.IntStream;

public class H_5 {

    /*
    Create a method called isPalindrome() which accepts an input string word and returns true or false if it is a palindrome
    For example:
    isPalindrome("tacocat") -> true
    isPalindrome("lololl") -> false
     */


    public static void main(String[] args) {
        String isPalindrome = "lololl";
        String reverse = "";


        for (int j = isPalindrome.length()-1; j >= 0; j--) {
            reverse+= isPalindrome.charAt(j);
            System.out.println(reverse);

        }
        if (reverse.equals(isPalindrome)){
         System.out.println("Palindrome");
        }else {
        System.out.println("Not Palindrome");
        }



    }
}
