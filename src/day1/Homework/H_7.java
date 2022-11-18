package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H_7 {


    // Write a method called findMax
    // You are given an arraylist and you need to return the max value

    public static void findMax(ArrayList<Integer> maxV) {
        Integer s = 0;
        for (int i = 0; i < maxV.size(); i++) {
            if (s < maxV.get(i)){
                s =  maxV.get(i);
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ArrayList<Integer> maxValue = new ArrayList<>(Arrays.asList(2,15,55,22,6,7,8));
        findMax(maxValue);
    }

}
