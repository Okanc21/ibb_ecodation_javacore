package com.okancelik.tutorials._1_week;

import java.util.Scanner;

public class _08_1_Scanner {

    public static void main(String[] args) {

        String name, surname;
        String language; // dil bilgisi için bir String değişkeni

        // Kullanıcıdan veri almak için
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz.");
        name = klavye.next();

        System.out.println("Lütfen soyadınızı giriniz.");
        surname = klavye.nextLine();
        // Stringten int e geçerken Scanner nasıl çözebiliriz.
        System.out.println("Bildiğiniz diller ve kullandığınız teknolojiler nelerdir?");
        language = klavye.nextLine(); // Dil veya teknolojiler bir String olarak alınabilir

        System.out.println("Adınız: " + name + "\nSoyadınız: " + surname + "\nDiller/teknolojiler: " + language);

        // Kullanılmayan Scanner nesnesini kapatalım.
        klavye.close();


    }
}
