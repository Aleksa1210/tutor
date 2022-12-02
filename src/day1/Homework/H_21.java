package day1.Homework;

public class H_21 {

    public static void main(String[] args) {


        /*
        Homework:
        1. Given a matrix, return the count of 1s present in the matrix.
        For example:
        Input = [ [1,1], [1, 0,1], [0,0], [1,1,1] ]
        Output = 7
         */

      int [][] input = {{1,1}, {1, 0,1}, {0,0}, {1,1,1}};
      int sum = 0;

        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < input[j].length; i++) {
                sum += input[j][i];
            }
        }
        System.out.println("First task " + sum);
        
        
        /*
        2. Given a matrix, determine the length of the longest inner array.
        For example:
        Input = [ [0, 2], [1,0,1], [0], [9,2,4], [2,0,3,4] ]
        Output = 4
         */


        int [][] input2 = {{0, 2}, {1,0,1}, {0}, {9,2,4}, {2,0,3,4}};
        int sum2 = 0;

        for (int i = 0; i < input2.length; i++) {
            if (sum2 <input2[i].length){
                sum2 = input2[i].length;
            }
        }
        System.out.println("Second task " + sum2);
        
        






    }
}
