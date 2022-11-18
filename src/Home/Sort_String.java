package Home;

import java.util.Arrays;

public class Sort_String {
    public static void main(String[] args) {


        String n = "dans";
        char [] chArr = n.toCharArray();
        char temp;

        String sortedSyr = "";





        for (int i = 0; i < n.length(); i++) {

            for (int j = 0; j < n.length()-1; j++) {
                if (chArr[i] < chArr[j]){
                   temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;



                }
            }
        }


        for (int i = 0; i < chArr.length; i++) {
            sortedSyr = sortedSyr + chArr[i];

        }

        System.out.println(sortedSyr);

    }



}
