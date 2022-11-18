package Home;

public class ex {
    public static void main(String[] args) {

        String letter = "bslta";
        char tempt;
        char [] charLetter = letter.toString().toCharArray();


        for (int i = 0; i < letter.length() ; i++) {

        for (int j = 0; j < letter.length()-1; j++) {
                String first = String.valueOf(charLetter[j]);
                String second = String.valueOf(charLetter[j+1]);

                if (first.compareTo(second) <0) {

                } else if (first.compareTo(second) == 0) {

                }else if (first.compareTo(second) > 0) {
                    tempt = charLetter[j];
                    charLetter[j] = charLetter[j+1];
                    charLetter[j+1] = tempt;
                }
            }
        }
        System.out.println(charLetter);


        StringBuilder a = new StringBuilder();
        a.append(letter);
        a.reverse();
        System.out.println("Total " + a);









    }
}
