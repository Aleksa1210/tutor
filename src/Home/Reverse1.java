package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class Reverse1 {
    public static void main(String[] args) {

       String ex = "Himanshu";
       String empty = "";
      /*for (int i = 0; i < ex.length(); i++){
          empty = ex.charAt(i) + empty;
         System.out.println(empty);
      }

       */
        for (int i = ex.length()-1; i >= 0; i--){
            empty += ex.charAt(i);
            System.out.println(empty);
        }

/**
2- write pseudo code to insert an ascending number (starting from 0)
 after every two chars in a string, so "hippopotamus" will become: "hi0pp1op2ot3am4us5".
 */

//            String code = "hippopotamus";
//            int number = 0;// 2
//            int temp = 0;// 0
//            String temp1 =""; // "hi0pp1"
//            for (int i = 0; i < code.length()-1; i++){
//
//                temp1 += code.charAt(i);
//                temp += 1;
//                if (temp == 2){
//                    temp1 += number;
//                    temp = 0;
//                    number += 1;
//                }
//
//            }
//        System.out.println(temp1);
//            }


    String code = "hippopotamus";
    int number = 0;// 2
    int temp = 0;// 0
    String temp1 =""; // "hi0pp1"
            for (int i = 0; i <= code.length()-1; i++){

        temp1 += code.charAt(i);
        temp += 1;
        if (temp == 2){
            temp1 += number;
            temp = 0;
            number += 1;
        }
                System.out.println(temp1);
    }

}

}
