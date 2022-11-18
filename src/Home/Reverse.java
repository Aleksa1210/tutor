package Home;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        // reverse 54321
        String a = "12345";
        String empty ="";
        for (int j = 0; j < a.length(); j++){
            String b = String.valueOf(a.charAt(j));
            empty = b + empty;

        }
        System.out.println(empty);


        // revers cars --> acsr
        String k = "cars";
        String empt = "";
        for (int f = 1; f < k.length(); f+=2){
            String reverse = String.valueOf(k.charAt(f));
            String reverse2 = String.valueOf(k.charAt(f - 1));
            empt = empt + reverse + reverse2;

        }
        System.out.println(empt);


    // remove duplicate ABCDE
        String duplicate = "AAABBBCCDDDEEE";
        String emt = "";
        for (int i = 0; i < duplicate.length(); i++ ){
            String convert = String.valueOf(duplicate.charAt(i));
            if (!emt.contains(convert)){
                emt += convert;
            }
        }
        System.out.println(emt);


        // sum 13
        String str = "1237";
        int sum = 0;
        for (int i =0; i < str.length(); i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);


        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i< words.size(); i += 2) {

            String temp = words.get(i);
            words.set(i, words.get(i + 1)); // storing " In to position i, 0
            words.set(i + 1, temp); // index 1

            //( in, " cat, "in", "the", "hat" it swap the indexes
            System.out.println(words);
        }

        }
}
