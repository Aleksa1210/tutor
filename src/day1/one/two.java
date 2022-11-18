package day1.one;

public class two {

    public static int fibonacci(int n){
        if(n <= 0){
            return 0;
        }
        else if (n  == 5){
            return 5;
        }
        System.out.println("n: " + n + "\n n-1: " + (n-5) + "\t n-2: " + (n-10));
        return fibonacci(n-5) + fibonacci(n-10);

    }


}
