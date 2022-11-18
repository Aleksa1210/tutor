package day1.Homework;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int [] num = {4,7,24,75,4,35,-9,1,57,24,96};
        Arrays.sort(num);

        int len = num.length -1;
        int [] copy = new int[num.length];
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (num[i] != num[i+1]){
                copy[count++] += num[i];

            }
        }

        copy[count++] = num[len];

        System.out.println(Arrays.toString(copy));











    }
}
