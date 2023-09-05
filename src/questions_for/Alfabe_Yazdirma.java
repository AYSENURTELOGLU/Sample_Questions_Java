package questions_for;

public class Alfabe_Yazdirma {
    public static void main(String[] args) {

        /*
        Soru:
        Alfabeyi konsola yazdırın.
        örnek:
        a b c .. .. .. .. y z
        ipucu: char kullanmak iyi bir fikir olabilir.
         */

        char ilkHarf='a';
        char sonHarf='z';
        String alfabe="";

        for (char i = 'a'; i <='z' ; i++) {

            alfabe+=i+" ";

        }

        System.out.println(alfabe);
    }
}




