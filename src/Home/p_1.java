package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p_1 {
    public static void main(String[] args) {

        Integer [] num = {1,2,3,10,4,22,5,6};
        int max = 0;
        int min = 100;

        for (int i = num.length-1; i >= 0; i--){

            System.out.println("reverse" + num[i]);

        }



//        //Arrays.sort(num);
//        //System.out.println(Arrays.asList(num));
//        for (int i = 0; i < num.length; i++){
//        if (max < num[i]){
//            max = num[i];
//        } if (min > num[i]){
//            min = num[i];
//            }
//
//
//
//
//
//        }
//        System.out.println("min" + min);
//        System.out.println("max" + max);
//        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,10,4,0,22,5,6));
//        Collections.sort(nums);
//       System.out.println(nums);
//       Collections.reverse(nums);
//        System.out.println(nums);
//        Collections.max(nums);
//        System.out.println(nums);
//        Collections.min(nums);
//        System.out.println(nums);
//
//

    }
}
