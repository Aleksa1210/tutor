package day1.one;

import java.util.Hashtable;

public class target1 {
    public static int[] targ(int[] a, int sum) {
    /*
     {2, 7, 11,  15}
     {2: 0,
     7 : 1,
     11 : 2,
     13 : 3}

     target = 9
     Is (target - a[i] ) inside exampleTable?
     return i, exampleTable.valueOf(target - a[i] )
     */
        int[] retArray = new int[2];
        Hashtable<Integer, Integer> valueIndex = new Hashtable<>();
        for (int i = 0; i < a.length; i++) {
            if (!valueIndex.contains(a[i])) { // 2
                valueIndex.put(a[i], i); //a[i] - 2 (key) , i - 0 (value)
            }
            int otherIndex  = sum - a[i]; // 15 - 2
            if (valueIndex.contains(otherIndex)){ // * + 2 = 15, we try to find *
                retArray[0] = i; // [0, _ ]
                retArray[1] = valueIndex.get(otherIndex); // [0, 3]
                System.out.println(retArray[0]);
                System.out.println(retArray[1]);
                return retArray;
            }
        }
        return retArray;
    }


    public static void main(String[] args) {
        int[] input = {2, 7, 11, 13};
        int target = 15;
        targ(input, target);




    }
}
