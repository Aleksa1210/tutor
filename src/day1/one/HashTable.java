package day1.one;

import java.sql.SQLOutput;
import java.util.Hashtable;

public class HashTable {
    /**
     * Given a string, return the character that appears the most
     * For example: input "hiiiiiiiii"
     * Returns "i"
     */

    public static Character returnCharacter(String input) {

        Hashtable<Character, Integer> ex1 = new Hashtable<>();

        for (int i = 0; i < input.length(); i++) {
            Character a = input.charAt(i);

            if (ex1.containsKey(a)) {
                int update = ex1.get(a) + 1;
                ex1.put(a, update);
            }
            else { // characters not in the hashtable yet
                ex1.put(a, 1);
            }
        }

        for (Character key: ex1.keySet()){
            System.out.println(key + " : " + ex1.get(key));
        }

        Character tempChar_max = input.charAt(0); // Character h
        Integer tempInt_max = ex1.get(tempChar_max); // take value of the Key 'h' - 1

        System.out.println("temp max key and value pair: " + tempChar_max + ":" + tempInt_max);
        for (Character key: ex1.keySet()) { // ex1.keySet() - going from the keys
            Integer value = ex1.get(key); // value of key

            if (value > tempInt_max){
                tempInt_max = value;
                tempChar_max = key;
                System.out.println("temp max key and value pair: " + tempChar_max + ":" + tempInt_max);
            }


        }

        return  tempChar_max;
    }

/*
        array = {5, 3, 2, 8, 4}
        max = array[0]
        for loop
            if num > max:
                max = num
        return max

        string = "hello"
        dict = {"h" : 1, "e" : 1, "l" : 2, "o" : 1}
        max_char = string[0] // "h"
        temp_max = dict.get(string[0]) // temp_max = 1, it's just choosing the count of the first letter in string
        for char : dict.keySet()
            if dict.get(char) > temp_max:
                temp_max = dict.get(char)
                max_char = char
        return max_char
 */



    public static void main(String[] args) {

        String word = "hiiii";
        System.out.println(returnCharacter(word));

    }



}
