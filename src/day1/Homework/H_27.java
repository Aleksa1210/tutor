package day1.Homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class H_27 {
    public static void main(String[] args) {

        /* Player A and Player B are playing a game.
           Each time a player wins a round they can earn a score between 1-3
           When a player is ahead by 4 points, they win the game.

           Input: A3B1B2B1A3B1A3 (A wins with 9, B loses with 5)
           Output: Player A
        * */


        String a = "A3B1B2B1A3B1A3";
        int playerA = 0;
        int playerB = 0;

        for (int i = 0; i < a.length(); i+=2) { // A
            if (a.charAt(i) == 'A'){
                playerA += Integer.parseInt(""+ a.charAt(i+1));
                //System.out.println(playerA);

            } else if (a.charAt(i) == 'B'){
                playerB += Integer.parseInt("" + a.charAt(i+1));
                System.out.println(playerB);
            }
        }
        if (playerA > playerB){
            System.out.println("playerA is winner " + playerA);
        } else {
            System.out.println("playerB is winner " + playerB);
        }

        /*
        Given an int array, find the smallest value and the largest value.
        Swap these two integers.

        For example:
        Input: {5,1,19,20,13,6,2}
        Output :{1,2,5,6,13,19,20}
         */

        Integer [] n =  {5,1,19,20,13,6,2};
        Integer tempt = 0;

        for (int i = 0; i < n.length; i++) { // 5

            for (int j = 0; j < n.length-1; j++) {

                if (n[j] > n[j+1]){ // 5 > 1
                    tempt = n[j];
                    n[j] = n[j+1];
                    n[j+1] = tempt;
                }
            }
        }
        System.out.println(Arrays.toString(n));


   /*
        Given an int array, find the smallest value and the largest value.
        Swap these two integers.

        For example:
        Input: {5,1,19,20,13,6,2}
        Output: {5,20,19,1,13,6,2}

         */
        Integer [] b =  {5,1,19,20,13,6,2};
        int tempMax = 0;
        int indexMAx = 0;
        int tempMin = 10000;
        int indexMin = 0;
        int temp = 0;

        for (int i = 0; i < b.length; i++) {

            if (b[i] > tempMax){
                tempMax = b[i]; // 20
                indexMAx = i;
            }

        if (b[i] < tempMin){
            tempMin = b[i];
            indexMin = i;
            }
        }

        temp = b[indexMAx];
        b[indexMAx] = b[indexMin];
        b[indexMin] = temp;


        System.out.println(Arrays.toString(b));










    }
}
