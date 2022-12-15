package day1.Homework;

public class H_23 {
    public static void main(String[] args) {

        int num = 121;
        String temp = "";
        String turnToString = Integer.toString(num);

        for (int i = turnToString.length()-1; i >= 0; i--) {
          System.out.println(turnToString.charAt(i));
          temp += turnToString.charAt(i);
        }

        Integer convertToInt = Integer.valueOf(turnToString);
        System.out.println("convert " + convertToInt);

        if(temp.equals(turnToString)){
            System.out.println("Polindrom ");
        } else {
            System.out.println("Not");
        }


        if(convertToInt.equals(num)){
            System.out.println("Polindrom 2 ");
        } else {
            System.out.println("Not 2" );
        }




    }
}
