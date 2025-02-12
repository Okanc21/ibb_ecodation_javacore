package com.okancelik._1_part_javatypes;

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
        */

        // Primitive Tyrpes : 8 tanedir. Null değer alamazsınız.
        // tam sayılar(4) byte, int, short, long
        byte b1=127; // -128 ile +128 arası değer alır.
        System.out.println("byte: "+b1);

        short s1=32767;
        System.out.println("short: "+s1);

        int i1=2147483647;
        System.out.println("int: "+i1);

        long l1=9223372036854775807L; // long olduğunu anlamak için sonunda L harfi barındırmalıdır.
        System.out.println("long: "+l1);

        //virgüllü (floating point)
        float f2=3.14f;
        System.out.println("float: "+f2);

        double d2=3.14;
        System.out.println("double: "+d2);

        //boolean
        boolean b3=true;
        System.out.println("boolean: "+b3);

        //char
        char c4='a'; // a harfi tek tırnak içinde yazılmalıdır diğer türlü hata verir.
        System.out.println("char: "+c4);
    }
}
