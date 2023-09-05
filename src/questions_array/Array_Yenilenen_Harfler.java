package questions_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Yenilenen_Harfler {

    public static void main(String[] args) {
        /*
        Soru:
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
         */

        String str="Javacokkolay";

        char[] karakter=str.toCharArray();
        System.out.println(Arrays.toString(karakter)); //kontrol amaçlı
        //[J, a, v, a, c, o, k, k, o, l, a, y]


        List<String> tekrarEdenListesi=new ArrayList<>();
        for (int i = 0; i < karakter.length; i++) {

            for (int j = i+1; j < karakter.length; j++) {

                if (karakter[i]==karakter[j] && !tekrarEdenListesi.contains(String.valueOf(karakter[i]))){
                    tekrarEdenListesi.add(String.valueOf(karakter[i]));
                }
            }
        }
        System.out.println(tekrarEdenListesi);  //[a, a, a, o, k]

    }
}


