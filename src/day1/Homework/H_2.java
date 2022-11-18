package day1.Homework;

import java.util.Hashtable;

public class H_2 {

    /*
    2. Given a string and a character inside the string, return the number of times the char appears in the string. (Use a hashtable)
For example: if string = "university" and the character = "i"
The output should be 2.
     */

    public static void hashTabl (String word, Character target){

        Hashtable <Character, Integer> table = new Hashtable<>();
        String tempt = "";



        for (int i = 0; i < word.length(); i++) { // "university"
            Character letter = word.charAt(i);


            if (table.containsKey(letter)) {
                int value = table.get(letter) + 1;
                table.put(letter, value);
            } else if (!table.containsKey(letter)) {
                table.put(letter, 1);
            }

        }
           System.out.println(target + ": " + table.get(target));

//
//
//            Integer temptMax = 0;
//          String temptString =
//          for (Character key : table.keySet()){ // keySet() - give only key
//              Integer values = table.get(key); // value
//
//              if (values > temptMax){
//                  temptMax = values;
//              }
//
//
//
//
//
//
//            }
//        System.out.println(temptMax);

    }



    public static void main(String[] args) {
        String word ="univeirsity";
        hashTabl(word, 'i');

    }
}
