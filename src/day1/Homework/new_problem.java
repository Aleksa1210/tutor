package day1.Homework;

public class new_problem {

    /*
    Create a method  that accepts a string argument and returns
    every character at the multiple of 3's index
    For example: "I love programming"
    Returns: "lerrmg"
     */

    public static String remove( String a) {

        String temp = "";
        int count = 0;

//    for (int i = 0; i < a.length(); i++){
//        count++;
//        System.out.println(i);
//        if (count == 3){
//            temp += a.charAt(i);
//            count = 0;
//
//        }
//
//    }
//return temp;
//    }
        /*
        I = 0
          = 1
        l = 2*
        o = 3
        v = 4
        e = 5*

        2 % 3 == 2
        5 % 3 == 2

         */
        for (int i = 0; i < a.length(); i++){ // "I love programming"
            // % modulo / divide
            if (i % 3 == 2 ){ //0 -1 - 2 - 3
                temp += a.charAt(i);
            } else {

                continue;
            }


        }

return temp;

    }







    public static void main(String[] args) {

        String word = "I love programming";
        System.out.println(remove(word));

    }
}
