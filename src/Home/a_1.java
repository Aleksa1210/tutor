package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a_1 {
    public static void reverses(ArrayList<Integer> ex){

       // Collections.sort(ex);
       // System.out.println(ex);

        Integer temp = 0;  // MAX
       for (int i = 0; i < ex.size(); i++){
           if (ex.get(i) > temp){
               temp = ex.get(i);
           } else {
               continue;
           }
       }
        System.out.println(temp);


       Integer summ = 0; // SUMM
       for (int i = 0; i < ex.size(); i++){
           summ += ex.get(i);
       }
        System.out.println(summ);


       for (int i = 0; i < ex.size(); i++){ // EVEN ODD
           if (ex.get(i) % 2 == 0){
               System.out.print("odd" + ex.get(i));
           } else if (ex.get(i) % 2 == 1){
               System.out.print("even " + ex.get(i));
           }

       }

        System.out.println(ex.toString());
       for (int i = ex.size() -1 ; i >= 0; i--){
           System.out.println(ex.get(i));


       }
  Collections.reverse(ex);
        System.out.println(ex);

    }

    public static void main(String[] args) {
        ArrayList<Integer> ex =  new ArrayList<>();
        ex.add(2);
        ex.add(10);
        ex.add(31);
        ex.add(100);
        ex.add(17);
        ex.add(3);


        reverses(ex);


    }

}
