package Home;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {


    String so = "jk5s1d!o3em#a0";

    char [] letterCharrArray = so.toString().toCharArray();

        for (int i = 0; i < so.length(); i++) {

            for (int j = 0; j < so.length() - 1; j++) {

                String first = String.valueOf(letterCharrArray[j]);
                String second = String.valueOf(letterCharrArray[j+1]);

                if (first.compareTo(second) < 0){

                } else if (first.compareTo(second) == 0){


                }else if (first.compareTo(second) >0){
                    char tempt = letterCharrArray[j];
                    letterCharrArray[j] = letterCharrArray[j+1];
                    letterCharrArray[j+1] = tempt;
                }
            }
        }
        System.out.println(String.valueOf(letterCharrArray));
        System.out.println(Arrays.toString(letterCharrArray));



     String [] clear = (so.replaceAll("[^0-9]", "").split(""));
     int total =0;
     int add = 0;

        for (int i = 0; i < clear.length; i++) {

            add = Integer.valueOf(clear[i]);
            total+=add;
            System.out.println(total);


        }





        int [] a =  {3,4,6,7,8,9};
        int totals = 0;

        for (int i = 0; i < a.length; i++) {
            totals += a[i];


        }

        System.out.println(totals);

    }

}
