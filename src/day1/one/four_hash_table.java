package day1.one;

import java.util.Hashtable;

public class four_hash_table {
    /* Create a function that returns a boolean  if two strings contain the same number of characters */
    public static boolean equalChars(String a, String b){ // run in linear time
        Hashtable<Character, Integer> charTable = new Hashtable<Character, Integer>();
        for (int i = 0; i < a.length(); i++){
            if (!charTable.contains(a.charAt(i))){
                charTable.put(a.charAt(i), 1);
            }
            else {
                charTable.put(a.charAt(i), charTable.get(a.charAt(i)) +1);
            }
        }

        for (Character key: charTable.keySet()){
            System.out.println(key + " : " + charTable.get(key));
        }
        /*
        't' : 1
        'h' : 1
        'a' : 1
         */
        for (int i = 0; i < b.length(); i++){
            if (charTable.containsKey(b.charAt(i))){
                charTable.put(b.charAt(i), charTable.get(b.charAt(i)) -1);
                if (charTable.get(b.charAt(i)) == 0){
                    charTable.remove(b.charAt(i));
                }
            }
            else {
                return false;
            }


        }

        if (charTable.size() == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println(equalChars("tha", "hatt")); //should return true
    }
}
