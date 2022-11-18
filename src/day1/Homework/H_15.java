package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H_15 {
    public static void main(String[] args) {

        String n = "23af1!exo;p)";
        String onlyLetter = n.replaceAll("[^a-z]","");
        System.out.println(onlyLetter);


        int [] num = {-99, -102, -45, -200};
        int tem = num[0]; // this does not work because if num = {-1000000, -10000001... } etc
        // solution: set the temp variable to be one of the elements inside the array
        // for example tem = num[0]

        /*
        {-99, -102, -45, -200}
        temp = -99
        for-loop:
            1. if -102 > -99
            2. if -45 > -99 => temp = -45
            3. if -45 > -45
            4. if -200 > -45
        return/print temp

        This works because temp is a number that already exists inside the array.
        If you use a number like -100000, that only works for arrays when the numbers are bigger
        but
         */
        for (int i = 0; i < num.length; i++) {
            if (num[i] > tem){
                tem = num[i];
            }
        }
        System.out.println("Temp" + tem);

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(-99, -102, -45, -200));
        System.out.println(Collections.max(nums));



        String word = "goduckgoduck";
        //String m = word.replaceFirst("duck", "");
        String allDuck = word.replaceAll("duck", "");
       // System.out.println(m);
        System.out.println(allDuck);
    }
}
