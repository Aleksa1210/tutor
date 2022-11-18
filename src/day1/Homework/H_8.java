package day1.Homework;

public class H_8 {


    public static void adultsAndChildren(int[] age){
        int adult = 0;
        int children = 0;

        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 18){
                adult++;
            } else if (age[i] < 18){
                children++;
            }

        }
        System.out.println("children " + children);
        System.out.println("adult "+ adult);

        System.out.print("There is " + children + " and " + adult + "adults. ");
System.out.printf("There are %d children and %d adults",children,adult);
    }





    public static void main(String[] args) {

        int [] age = {10, 3, 21, 29, 18, 9, 15, 19, 30};
        adultsAndChildren(age);

    }
}
