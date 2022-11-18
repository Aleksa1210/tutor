package day1.one;

public class three {
    public static boolean ex(String first){

        /*word = mamam;
        i = 0;
        m[0] m[length-1 = 4]
        a[1] a[4-1 = 3]

        i = 0
        word[i] = m
        word[length()-1-i] = m
            4-1-0

        i = 1
        word[i] = a
        word[length()-1-i] =
        4-1-1



         */


        for (int i = 0; i < first.length()/2; i++){ // ma   ma
            System.out.println("index of the first char: " + i + "\nindex of the second char: " + (first.length()-1-i));
            System.out.println("comparing " + first.charAt(i) + " with " + first.charAt(first.length()-1));
            if (first.charAt(i) != first.charAt(first.length()-1-i) ) {
                //
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(ex("mamam"));



    }

}
