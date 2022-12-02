package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class H_22 {
    public static void main(String[] args) {

        int [][] a = {{1,0,1}, {1,2,1,5}, {5,0}};
        int [][] b = {{0,0,2}, {4,0,1}, {1,4,2}};
        /*
        {{1,0,1}, {1,2,1,5}};
        {{0,0,2}, {4,0,1}};
       ={{1,0,3}, {5,2,2,5}, {6, 4, 2};
         */
        ArrayList<ArrayList<Integer>> c = new ArrayList<>();


        // for-loop to determine bigger array length
        for (int i = 0 ; i < a.length; i++){
            int maxlength;
            if (a[i].length >= b[i].length){
                maxlength = a[i].length;
            }
            else {
                maxlength = b[i].length;
            }
            
            ArrayList<Integer> temp = new ArrayList<>(); // temp ={}
            for (int j = 0; j < maxlength; j++) {
                temp.add(0);
            } // temp = {0,0,0}
            c.add(temp);
            //System.out.println(c.get(i).toString());

        }
        // c = {{0,0,0}, {0,0,0,0}}
        // {{0,1,0}, {0,0,0,0}}

        /*
        ArrayList<Integer> temp = c.get(0); // temp = {0,0,0}
        temp.set(1, 1); // set the 1st index to 1 = {0,1,0}
        c.set(0,temp); // c = {{0,1,0}, {0,0,0,0}}
        */


        /*
        c = {{0,0,0}, {0,0,0,0}
        temp = {1,0,1}

         */


        for (int i = 0; i < a.length; i++) {
            ArrayList<Integer> temp = convert(a[i]); // i = 0, 1
            for (int j = 0; j < a[i].length; j++) {
                //System.out.println(temp[j]);
                c.get(i).set(j, temp.get(j));

                /*

                temp.get(j) means get index j from temp
                set(0, 1) means put 1 on the 0 index
                c.get(i) is {0,0,0}

                so the entire line makes this:
                c = {{1,0,0}, {0,0,0,0}}
                 */

            }
         //   System.out.println(c.get(i).toString());

        }
        // b = {{0,0,2}, {4,0,1}, {1,4,2}};

        for (int i = 0; i < b.length; i++) {
            ArrayList<Integer> temp = convert(b[i]); // i = 0, 1
            for (int j = 0; j < b[i].length; j++) {
                int prev = c.get(i).get(j); // grabs the list at index i, then grabs the number at index j;
                c.get(i).set(j, prev + temp.get(j));
            }
            System.out.println(c.get(i).toString());
        }
       


    }
    public static ArrayList<Integer> convert(int[] prim){
        ArrayList<Integer> ret= new ArrayList<>();
        for (int num : prim){
            ret.add(num);
        }
        return ret;
    }


}
