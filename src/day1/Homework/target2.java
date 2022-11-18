package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class target2 {
/*
    Given two strings word1 and word2, return an ArrayList the same size of word2 that contains the numbers of times that character is found in word1.
    Use Hashtable

    For example:
    word1 = "hello"
    word2 = "hi"
            return {1, 0} // h appears 1 time in hello, i appears 0 times in hello

    {
    h - 1
    i - 0
    }


            {
            0 - h
            1 - e
            2 - l
            3 - l
            4 - o
            }

    word1 = "byebye"
    word2 = "bye"
            return {2, 2, 2}

    {b - 1
    y - 0
    e - 0

            */

    public static ArrayList<Integer> conta(String word, String word2) {

        Hashtable<Character, Integer> empty = new Hashtable<>();
        for (int i = 0; i < word2.length(); i++) {
            Character ex = word2.charAt(i);
            empty.put(ex, 0);

        }


        for (int j = 0; j < word.length(); j++) {
            Character ex2 = word.charAt(j);
            if (empty.containsKey(ex2)){  // if kwy from word2 cointain key from word1
                int valOfKey = empty.get(ex2); // then we get value from word1
                empty.put(ex2, valOfKey + 1); // then we update the value to empty
            }
        }
        /*
        for (Character key : empty.keySet()){
            System.out.println(key + ": " + empty.get(key));
        }
        */

        ArrayList<Integer> retArray = new ArrayList<>();
        for (Integer val:  empty.values()){
            retArray.add(val);
        }



        return retArray;

    }






    public static void main(String[] args) {
      String  word1 = "byebye";
       String word2 = "bye";
       System.out.println(conta(word1,word2));
    }
}
