package Home;

public class Leave_onl_numbers_delete_letter {
    public static void main(String[] args) {




        String  str = "aA11bC-20d@033";
        String [] numberOnly= (str.replaceAll("[^0-9]", "").split(""));
        String letterOnly = str.replaceAll("[^a-z]", "");
        String letterLowerOnly = str.replaceAll("[^A-Za-z0-9]", "");
        String symbelOnly2 = str.replaceAll("[A-Za-z0-9]", "");
        System.out.print("Letter " + letterOnly);
        System.out.println("_________________");
        System.out.print("Symbol" +symbelOnly2);
        int sum= 0;


//        for (int i = 0; i < numberOnly.length; i++) {
//            int add = Integer.valueOf(numberOnly[i]);
//            System.out.println(sum = add + sum);
//        }
    }
}
