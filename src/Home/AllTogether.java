package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/**
 * 12345 --> 54321
 */

public class AllTogether {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2,4,8,2,9,45,-2));
        Collections.reverse(num);
        System.out.println(num);

        ArrayList<String> leteer = new ArrayList<>(Arrays.asList("a","b","s","j","d","f"));

        Collections.reverse(leteer);
        System.out.println(leteer);

        Collections.sort(num);
        System.out.println(num);


        String sor = "A1#H5B7@L0C9M!1D5E2F";
        char [] toArray = sor.toCharArray();
        Arrays.sort(toArray);
        System.out.println(toArray);




        int z[] = {3, 6, 2, 68, 32,-2, 24};
        Arrays.sort(z);
        System.out.println(Arrays.toString(z));



        int j = Integer.valueOf('a'); // ascii
        System.out.println(j);

        int j2 = 'A';
        System.out.println(j2);

        //ABC
        String j3 = "ABC";
        for (int i = 0; i < j3.length(); i++){
            char ch = j3.charAt(i);
            int convert = ch;
            System.out.print(convert + " ");
        }
        char j4 = 107;
        System.out.println(j4);





//Anagra
        BiPredicate<String, String> anagram = (one, two) -> {
            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);

            return Arrays.equals(oneArr, twoArr);
        };

        System.out.println(anagram.test("listen", "silent"));




        ArrayList<String>words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i< words.size(); i += 2) {

            String temp = words.get(i);
            words.set(i, words.get(i + 1)); // storing " In to position i, 0
            words.set(i + 1, temp); // index 1

            //( in, " cat, "in", "the", "hat" it swap the indexes
            System.out.println(words);
        }




        // distinct(): remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,4,4,5, 5));
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));
        // convert to stream +USE THE METHODS + collect+ Collectors
        // .stream(); // convert to stream
        // .distinct() remove duplicate
        // .collect(Collectors.toList() - convert stream back to a list











        }







}
