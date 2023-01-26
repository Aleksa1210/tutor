package day1.Homework;

public class H_28 {
    /*
    1. Given a string and an integer, output the string multiplied by the integer.
    For example:
    Input: "hello" and 3
    Output: "hellohellohello"
         */
    public static String multiplyString(String string, int number){
        String empty = "";
        for (int i = 0; i < number; i++) {
            empty += string;
        }
        return empty;
    }
    public static void main(String[] args) {

        multiplyString("Hello", 3);

        /*
        2. Given an int array, return the count of even numbers and odd numbers.
        For example:
        Input: {4,2,1,31,23,5,12}
        Output: 3 evens, 4 odds
        */

       int [] input = {4,2,1,31,23,5,12};
       int countOdd = 0;
       int countEvens = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 1){
                countOdd++;
            } else if (input[i]  % 2 == 0){
                countEvens++;
            }
        }
        System.out.println("countEvens = " + countEvens + "; countOdd = " + countOdd);



        /*
        Just for fun:
        You are a cashier. Someone wants to buy something for $x and they give you $y. For example, they want to buy candy for $2.30 and they give you $5. You only have coins, how many quarters, dimes, nickels, pennies, do you give the customer?
         */

        double price = 2.30;
        double money = 5.00;

        double quarters = 0.25;
        double dimes = 0.10;
        double nickels = 0.05;
        double pennies = 0.01;

        double change = money - price;
        System.out.println(change); // 2.70

       int quarterHowMuch = (int) (change /  quarters) ; // 2.70 / 0.25 = 10.8 --> 10
        System.out.println(quarterHowMuch);

        change = change - (quarterHowMuch * quarters);
        System.out.println(change);

        int nickelsHowMuch = (int) (change / nickels);
        System.out.println(nickelsHowMuch);


        System.out.println("Give quarter = " + quarterHowMuch + " Give nickels = " + nickelsHowMuch + "total change = " +
                ((quarterHowMuch * quarters) + (nickelsHowMuch * nickels)));




        String word = "Helolo"; // swap e and the o... Holle... H + word[indexOfO] + ll + word[indexOfE] Helo
        int indexOfE = 0;
        int indexOfO = 0;
        String tempt = ""; // temp = H + word[indexOfO] + ll + word[indexOfE]
        int indOfE = word.indexOf("e");
        int indOfO = word.indexOf("o");
        for (int i = 0; i < word.length(); i++){

           if (word.charAt(i) == 'e'){
               indexOfE = i;
            } else if (word.charAt(i) == 'o'){
               indexOfO = i;
           } else {
               tempt += word.charAt(i);
           }
        }
        // tempt = hll
        tempt = word.substring(0, indexOfE) + "o" + word.substring(indexOfE + 1, indexOfO) + "e";
        System.out.println(tempt);







    }
}
