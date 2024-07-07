package task2;

import java.util.Scanner;

public class _zipProje {
    public static void main(String[] args) {
        // Metnin ikinci karakterinden başlayarak her karakter için döngü
        // Mevcut karakter önceki karaktere eşitse
        // Sayaç arttırılır
        // Eğer mevcut karakter önceki karakterden farklıysa,
        // önceki karakterin sayısı ve karakteri sıkıştırılmış metne eklenir,
        // sonra sayaç sıfırlanır
        // Döngüden çıktıktan sonra, son karakterin sayısı ve karakteri sıkıştırılmış metne eklenir
        // Sıkıştırılmış metin döndürülür

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen Bir Text Giriniz=");
        String cumle=scanner.nextLine();
        String compressText="";

        for (int i = 0; i < cumle.length(); i++) {
            int sayac=0;
            char anlikChar=cumle.charAt(i);
            if (compressText.contains(String.valueOf(anlikChar))){
                continue;
            }
            for (int j = 0; j < cumle.length(); j++) {
                if (cumle.charAt(j)==anlikChar){
                    sayac++;
                }
            }
            compressText=""+compressText+sayac+anlikChar;
        }
        System.out.println(compressText);
    }
}

