package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class H_24 {
    public static void main(String[] args) {

        String a = "ABBCCCAATMM"; // => output return A3B2C3T1M2
        int count = 0;
        String temp = "";


        for (int i = 0; i < a.length() ; i++) { // A
            if (!temp.contains("" + a.charAt(i))) {
                temp += a.charAt(i);
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(i) == a.charAt(j)) {
                        count++;
                    }
                } // after, count = 3
                temp += String.valueOf(count);
                count = 0;
            }
        }
        System.out.println(temp);




        String am = "hellohi"; // h2e1l2o1i1
        String temp1 = "";
        int count1 = 0;
        int[] output = new int[am.length()]; // [0,0,0,0,0,0,0] output[0] = 2
      //  Output = {2, 1, 2, 2, 1, 2, 1}


        for (int i = 0; i < am.length(); i++) { //h

            for (int j = 0; j < am.length(); j++) {
                if (am.charAt(i) == am.charAt(j)){
                    count1++;

                }
            }
            //temp1 += am.charAt(i) + "" + count;
            output[i] =  count1;
            count1 = 0;
        }
        System.out.println(Arrays.toString(output));








    }
}
