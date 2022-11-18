package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class H_19 {
    public static void main(String[] args) {


        /*
        Given a list of lists (matrix), return the sum

        int [][] nums = [ [2,3,4] , [1,2,3] ]
        output -> 15

         */

        int [][] nums = { {2,3,4} , {1,2}};
        int e = 0;

        for (int j = 0; j < nums.length; j++) {

        for (int i = 0; i < nums[j].length; i++) { // i = 0, 1, 2
            e = nums[j][i] + e;
        }
        }
        System.out.println(e);


        /*
        Given two matrices, return the matrix that adds the two matrices.
        For example:
        int [][] a = [ [1,0,1], [1,2,1] ]
        int [][] b = [ [0,0,2], [4,0,1] ]

        return
        [ [1,0,3], [5,2,2]



        1 0 1      0 0 2
        1 2 1  +   4 0 1 3

        1 0 3
        5 2 2 3

        rows =

        */




        //int [][] a = {{1,0,1}, {1,2,1}};
        //int [][] b = {{0,0,2}, {4,0,1}};
        //int[][] sum = new int[2][3];



    }
    public static void addMatrices(int[][] a, int[][]b){
        int[][] sum = new int[a.length][a[0].length]; // 2 lists inside, inside each  list there are 3 elements
        /*
        a = [[1,2,3],[0,0,0,5]];
        a.length = 2;
        a[1].length = 3;

         */

        //   sum[0][0] = a[0][0] + b[0][0];
        //   sum[1][0] = a[1][0] + b[1][0];

        for (int i = 0; i < b.length; i++) { // i =0,1

            for (int j = 0; j < a[i].length; j++) {// j =0,1,2
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }

    }
}
