package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class H_9 {

    public static void multiplesof3(int [] multiple){

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < multiple.length; i++) {
            if (multiple[i] % 3 == 0){
              temp.add(multiple[i]);
            }
        }
        System.out.println(temp.toString());
        System.out.print(temp.toString());
    }


    public static void main(String[] args) {
    int [] multiple = {12, 4, 2, 9, 5, 6, 2, 7};
    multiplesof3(multiple);
    }
}
