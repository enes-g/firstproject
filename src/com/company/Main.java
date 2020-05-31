package com.company;

import JavaOop.CustomerManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Random Telefon Numarası Oluşturma Uygulamasına Hoşgeldiniz");

        String phoneNumber = "05387705158";
        Scanner scanner = new Scanner(System.in);
        String no = "";
        int i = 0;

        while (!phoneNumber.equals(no)) { //Telefon numarası, girilen telefon numarasına eşit değilse true dönecek
            System.out.println("Numara Giriniz :");
            no = scanner.nextLine();

            if (no.equals(phoneNumber)) {
                System.out.println("doğru telefon numarası");

            } else {
                System.out.println("Yanlış Telefon Numarası");
                break;
            }
            i++;
        }

        System.out.println("Yanlış Girilen Telefon Numarası Sayısı:" + i);


    }
}
