package questions_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kitaplik {
        /*
        Soru:
        Java'da Maps kullanarak bir kitaplık sistemi oluşturun.
        Kullanıcıdan kitap adı ve yazarını alarak kitapları kaydedin ve
        daha sonra istenilen kitap adını girerek yazarını bulan bir program yazın.
         */
    public static void main(String[] args) {

        Map<String, String> kitaplar = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kitap kaydetmek istiyorsunuz?");
        int kitapSayisi = scanner.nextInt();

        for (int i = 0; i < kitapSayisi; i++) {
            System.out.print("Kitap adını girin:");
            String kitapAdi = scanner.nextLine();

            System.out.println("Yazarını girin:");
            String yazar = scanner.nextLine();

            kitaplar.put(kitapAdi, yazar);
        }

        System.out.println("Bir kitap adı girin:");
        String arananKitap = scanner.nextLine();

        if (kitaplar.containsKey(arananKitap)) {
            String yazar = kitaplar.get(arananKitap);
            System.out.println("Kitabın yazarı: " + yazar);
        } else {
            System.out.println("Bu kitap kayıtlı değil.");
        }
    }
}
