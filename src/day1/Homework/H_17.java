package day1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class H_17 {
    public static void main(String[] args) {


        String stringA = "Jackson fell off the chair and laughed.";
        String stringB = "Amber must have had a hard day.";
        int countA = 0;
        int countB = 0;


        for (int i = 0; i < stringA.length(); i++) {
            if (stringA.toLowerCase().charAt(i) == 'a') {
                countA++;
            }
        }

        for (int j = 0; j < stringB.length(); j++) {
            if (stringB.toLowerCase().charAt(j) == 'a') {
                countB++;
            }
        }

        if (countA > countB) {
            System.out.println("Jackson fell off the chair and laughed.");
        } else {
            System.out.println("Amber must have had a hard day.");
        }


        String[] inputs = {"Jessie", "Jane", "Michael", "Jon", "Angelina", "Christy", "Joe", "Ken", "Louis", "Chris"};
        //Output = {"Jane","Jon", "Joe", "Ken",  "Louis", "Chris"}

        ArrayList<String> temp = new ArrayList<>();

        for (int j = 0; j < inputs.length; j++) {
            if (inputs[j].length() >= 3 && inputs[j].length() <= 5) {
                temp.add(inputs[j]);
            }
        }
        System.out.println(temp);


        System.out.println("____________________________________");


        Integer[] inputN = {5, 4, 8, 2};
        //   Output= {2,4,8,5} (element at index 0 and element at index 3 got swapped)
        Integer tempp = 0;
              tempp = inputN[0];
              inputN[0] = inputN[3];
              inputN[3] = tempp;
        System.out.println(Arrays.asList(inputN));










        Integer tempCont = 0;
        Integer tempCont2 = 0;
        Integer cont = 0;
       Integer [] newAr = {3,2,5,8};
        for (int i = 0; i < newAr.length; i++) {
            if (newAr[i] == 8){
                tempCont = i;
            } else if (newAr[i] == 2){
                tempCont2 = i;
            }
        }
        cont = newAr[tempCont];
        newAr[tempCont] = newAr[tempCont2];
        newAr[tempCont2] = cont;
        System.out.println(Arrays.asList(newAr));




    }
}
