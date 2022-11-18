package day1.Homework;

import java.util.HashSet;
import java.util.Set;

public class H_11 {

        public static void main(String[] args) {

            String name = "aaabddde";
            String empty = "";
            for (int i = 0; i < name.length(); i++) {
                Character letter = name.charAt(i);
                if (!empty.contains(String.valueOf(name.charAt(i)))){
                    empty+= letter;
                }
            }
            System.out.println(empty);


            System.out.println("____________________________");
            Set<String> set = new HashSet<>();


            for (int i = 0; i < name.length(); i++) {
                set.add(String.valueOf(name.charAt(i)));
            }
            System.out.println(set);



        }

}
