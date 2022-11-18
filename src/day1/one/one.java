package day1.one;

import java.util.HashSet;
import java.util.Set;

public class one {
    public static void main(String[] args) {

        String example = "#44, #117, #132";
        String empty = ""; //#4
        for (int i = 0; i < example.length(); i++){
            String k = String.valueOf(example.charAt(i));
            if (!empty.contains(k)){
                empty = empty + k;
            }

        }
        System.out.println(empty);


        System.out.println(ex()); // use method ex
    }
    public static boolean ex() {

        String num = "444";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < num.length(); i++) {

            if (set.contains(num.charAt(i))) {
                return false;
            }
            set.add(num.charAt(i));
            System.out.println(num.charAt(i));
        }

        return true;
    }
}
