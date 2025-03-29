package com.okancelik.tutorials._1_week;

public class _02_Variables {
    public static void main(String[] args) {
        //veri değişken isimlerini yazarken;
        /*
        veri isimlerndirmeleri;
        1-) isim, sıfat veya zamir kullanmamız lazım
        2-) _ veya $ ile başlayabilirsiniz
        3-) sayı ile bitebilir
        4-) sayı ile başlanmaz
        5-)_veya$ dışşında özel  simgelerler başlanmaz.
        6-) değişken isimlerimizi cameCase yapısına göre yazıyoruz.
        7-)anlamlı ve açıklayıcı isimler seçiniz
        8-)değişkenlerde boşluk kullanılamaz.
        */


        // veri isimlerndirmeleri;
        int schoolNumber = 25;
        System.out.println(schoolNumber);

        schoolNumber=44;
        System.out.println(schoolNumber);

        int _schoolNumber=55;
        System.out.println(_schoolNumber);

        int $schollNumber=99;
        System.out.println($schollNumber);

        int schollNumber123=299;
        System.out.println($schollNumber);

        // yzamazsınız
        // int schoolNumber=11;  aynı isimle yazamazsınız.
        // int 44schoolNumber=45;  sayıyla başlayamazsınız
        // int *schoolNumber=45;  özel simge ile  başlayamazsınız



    }
}
