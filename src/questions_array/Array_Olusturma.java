package questions_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Olusturma {
    public static void main(String[] args) {

        /*
        Soru:
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir uzunluk giriniz giriniz: ");
        int size= scan.nextInt();

        int[] arr=new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Lütfen sırayla elementleri giriniz");
            int element=scan.nextInt();
            arr[i]+=element;
        }
        System.out.println(Arrays.toString(arr));
    }
}

