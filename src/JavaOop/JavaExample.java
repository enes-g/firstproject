package JavaOop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class JavaExample {
    public static void main(String[] args) {

//
        int toplam = 0;
        int sayi;
        int i;
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayi Giriniz");
        int n = scn.nextInt();
        if (n < 0) {
            System.out.println("Sayı negatif olamaz");

        } else if (n > 0) {
            for (i = 0; i <= n; i++) {
                if (i < n) {
                    System.out.println(" Sayi " + i + " Giriniz : ");
                    sayi = scn.nextInt();
                    toplam += sayi;

                } else {
                    System.out.println("En fazla : " + n + "sayı girebilirsiniz");
                }

            }

        }


        System.out.println("Sayıların Toplamı : " + toplam);


//Girilen sayının kdv değerini hesaplayan program
      /* int sayi = 0;
        double fiyat = 0;
        final double kdv = 0.18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        sayi = scanner.nextInt();
        fiyat = sayi+(sayi * kdv);


        System.out.println("Girilen sayının kdv'li tutarı : " + fiyat);
        */

     /* double toplam = 0;
      double ortalama=0;
      int sayi = 0;

// Girilen 5 sayının toplmaını ve ortalmasını veren program
      Scanner scanner=new Scanner(System.in);
        System.out.println("5 Tane Sayı Giriniz");
        for(int i=0; i<6; i++){
            sayi=scanner.nextInt();
            toplam+=sayi;
            if (sayi>0){
                System.out.println("Yeni Sayı Giriniz" + i );
            }
            else {
                System.out.println("Girdiğiniz sayı 0'dan büyük olmalıdır");
            }
        }
        System.out.println("Sayıların Toplamı:" + toplam);
        ortalama=toplam/5;
        System.out.println("Sayıların Ortalaması:" + ortalama);

*/
        // Girilen sayının asal oluıp olmadığını bulan program
   /*     boolean asalMi = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        for (int i=2; i<sayi; i++) {
            if (sayi%i == 0) {
                asalMi = false;
                break;
            }
        }
        if (asalMi)
            System.out.println("Sayi asaldir");
        else
            System.out.println("Sayi asal degildir");
    }
*//*
                //Girilen sayının basamak değerini bulan program
                Scanner input = new Scanner(System.in);
                System.out.print("Sayi giriniz: ");
                int sayi = input.nextInt();
                int basamak = 0;
                while (sayi > 0) {
                    sayi = sayi / 10;
                    basamak++;

                }
                System.out.print("Basamak sayisi: " + basamak);
                */
    }
}

























