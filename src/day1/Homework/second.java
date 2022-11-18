package day1.Homework;

import day1.one.two;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class second {
    public static boolean isPolendrom(String ex) {
        String temporary = ""; //slol
        for (int i = ex.length() - 1; i >= 0; i--) {
            System.out.println(ex.charAt(i));
            temporary += ex.charAt(i);
        }
        if (!temporary.equals(ex)) {
            return false;
        }
        return true;
    }







    public static void main(String[] args) {
        System.out.println(isPolendrom("lols"));
    }
}
