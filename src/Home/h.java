package Home;

import java.util.Arrays;

public class h {
    public static void main(String[] args) {


        Integer [] num = {4,7,24,75,4,35,-9,1,57,24,96};
        Arrays.sort(num);

       int leng = num.length -1;
        int [] tempt = new int[num.length];
        int j = 0;

        for (int i = 0; i <leng ; i++) {
        if (num[i] != num[i+1]){
          tempt[j++] += num[i];

        }
        }

tempt[j++] = num[leng];
        for (int i = 0; i < tempt.length; i++) {
            System.out.println(tempt[i]);

        }







    }



}

