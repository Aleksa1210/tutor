package day1.one;

import java.util.ArrayList;
import java.util.Hashtable;

public class Attendanc {
    /**
     * Problem: Given an array of names that represent attendance
     * Return an array of names that has appeared at least 5 times
     *
     * Example: {"Adam", "Janice", "Billy", "Janice", "Aleksa", "Billy", "Bob", "Billy", "Billy", "Billy", "Janice", "Janice", "Janice"}
     * Return -> {"Janice", "Billy"}

     */


    public static void repeatNames (String [] name){
        Hashtable <String, Integer> hasTableNames = new Hashtable<>();


        for (int i = 0; i < name.length; i++){
            //System.out.println(name[i]);


            if (hasTableNames.containsKey(name[i])){
                Integer value = hasTableNames.get(name[i]);
                hasTableNames.put(name[i], value + 1);
             // System.out.println(hasTableNames);
            } else {
                hasTableNames.put(name[i], 1);
            }


        }


        for (String key: hasTableNames.keySet()){
            System.out.println("key: "+ key + ", value: "+ hasTableNames.get(key));
        }

        for (String key : hasTableNames.keySet()){  //returns a set view of the keys
            Integer value = hasTableNames.get(key);

            if (value >= 5){

                System.out.println("name: " + key + ", value: " + hasTableNames.get(key));
            }
        }






        //String [] returnArray = {};
        //return tempString;
    }




    public static void main(String[] args) {

        String [] name = {"Adam", "Janice", "Billy", "Janice", "Aleksa", "Billy", "Bob", "Billy", "Billy", "Billy", "Janice", "Janice", "Janice"};
        repeatNames(name);



    }


}
