package Home;

import java.util.Arrays;

public class pra {
    public static void main(String[] args) {

        Integer[] n = {2, 34, 67, 90, 5, 85};
        int tempt;
        //   String sort = "";

        int[] sort = {2, 34, 67, 90, 5, 85};

        for (int i = 0; i < n.length; i++) {


            for (int j = 0; j < n.length-1; j++) {


                if (n[j] > n[j + 1]) {
                    n = swap( n,j, j+1);

                }
            }
        }
        System.out.println(Arrays.toString(n));

    }

    public static Integer [] swap (Integer[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    }
    }
