package day1.Homework;

import java.util.HashSet;
import java.util.Set;

public class one {
     /* Create a function that accepts two strings and if the two strings share the same
    number of characters, the function will return true

    For example: "hat" and "tha" will return true, "" and "" return true, "tttt" and "tttt" return true

    Think about what the time complexity is for your code.
     */

    public static boolean theSame (String first, String second) {
        int i = first.length() - 1;
        int j = second.length() - 1;

        while ((i >= 0) && (j >= 0)) {
            if (second.contains(String.valueOf(first.charAt(i)))) {
                int target_index = second.indexOf(first.charAt(i));
                first = first.substring(0, i);
                // hat
                second = second.substring(0, target_index) + second.substring(target_index + 1);

            }
            i--;
            j--;
        }

        if ((first.length() == 0) && (second.length() == 0)) {
            return true;
        }
        return false;

        //  first = "tha" second = "hat"
        // first = "th" second = "ht"
        // first = "th" + "" = "th"
        // second = "h" + "t" = "ht"

    }

    public static void main(String[] args) {

    System.out.println(theSame("hatmkkp", "thamkk"));

    }
}
