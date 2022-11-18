package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverse_words_swap {
    public static void main(String[] args) {
        String str = "Cat in the hat";
        String str2 = "";

        String [] tempt = str.split(" ");

        ArrayList<String> n = new ArrayList<>(Arrays.asList(tempt));

        for (int i = 0; i < n.size(); i+=2) {

            Collections.swap(n,i, (i+1));

        }
        System.out.println(n);












    }
}
