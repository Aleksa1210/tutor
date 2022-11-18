package Home;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sort_method {
    public static void main(String[] args) {

       int [] num = {4,7,7,7,24,75,4,35,-9,1,57,24,96};
       Arrays.sort(num);

       int leng = num.length-1;
       int [] temp = new int[num.length];
       int j = 0;

        for (int i = 0; i < leng; i++) {

            if (num[i] != num[i+1]){
                temp[j++] = num[i];
        }
        }
        temp[j++] = num[leng];
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);

        }















    }
}