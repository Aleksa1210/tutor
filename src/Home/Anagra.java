package Home;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Anagra {
    public static void main(String[] args) {
        BiPredicate<String, String> anagram = (one, two) -> {
            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);

            return Arrays.equals(oneArr, twoArr);
        };

        System.out.println(anagram.test("listen", "silent"));
    }
}
