package Home;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates {

    public static void main(String[] args) {


        String str = "aabbsddeefggghhhhi";
        String empty = "";

        for (int i = 0; i < str.length(); i++) {
           // Character ch = str.charAt(i);
            if (!empty.contains(String.valueOf(str.charAt(i)))){
                empty += String.valueOf(str.charAt(i));
            } else {
                continue;
            }
        }
        System.out.println(empty);



       String letter = "aabbsddeefggghhhhi";
        Set<String> notDupl = new HashSet<>();
        for (int i = 0; i < letter.length(); i++) {
            notDupl.add(String.valueOf(letter.charAt(i)));
        }
        System.out.println(notDupl);
    }



}
