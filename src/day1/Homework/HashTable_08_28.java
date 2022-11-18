package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class HashTable_08_28 {
/**
    Problem 2:
    Given an array of strings, return the list of strings that have the max length

    Example: {"Bill", "Bob", "Janice", "Tricia", "Aleksa"}
    Lengths 4, 3, 6, 6, 6
    Return {"Janice", "Tricia", "Aleksa"}
    */
public static String maxLetter(String [] a){

Hashtable<String, Integer> hashtable = new Hashtable<>();
//        words.put("Bill",1);
//        words.put("Bob",1);
//        words.put("Janice",1);
//        words.put("Tricia", 1);
//        words.put("Aleksa", 1);


    ArrayList <String> names = new ArrayList<>();

    int tempMax = 0;

        for (int i = 0; i < a.length; i++){  // {"Bill", "Bob", "Janice", "Tricia", "Aleksa"}
            if (!hashtable.containsKey(a[i])){
                hashtable.put(a[i], a[i].length()); // Bill
                if (tempMax < a[i].length()){
                    tempMax = a[i].length();
                }
            }else {
                continue;
            }
        }
        for (String key : hashtable.keySet()){ // keySet() - give only key
            if (hashtable.get(key) == tempMax){
                names.add(key);
            }
        }
   //System.out.println(names.toString());
















//        int num1 =  1; // = is assignment, variable to data
//        int num2 = 2;
//        num1 == num2; // == is comparison, is num1 equal to num2? .... comparing primitives (int, char, boolean,..)
//        .equals()// objects (Integer, String, HashTable..)











return names.toString();
}

    public static void main(String[] args) {

    String [] names = {"Bill", "Bob", "Janice", "Tricia", "Aleksa"};
        System.out.println(maxLetter(names));

    }

}
