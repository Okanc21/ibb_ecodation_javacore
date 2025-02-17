package com.okancelik._1_week;

public class _04_2_JavaWrappertypes {

    public static void main(String[] args) {
        // PRİMİTİVE TYPE
        byte primitiveTypeByte = 127;
        // primitiveTypeByte=null; primitive type null değer veremezsiniz.
        // primitive type'lar null olamaz çünkü onlar ilkel (primitive) türlerdir.
        System.out.println(primitiveTypeByte);  // Çıktı: 127

        short primitiveTypeShort = 32767;  // short türündeki bir değeri tanımladık
        int primitivetypeInt = 2147483647; // int türündeki en büyük değeri tanımladık
        long primitiveTypeLong = 9223372036854775807L; // long türü büyük sayılar için, sonuna 'L' eklenmeli

        float primitiveTypeFloat = 14.23F; // float türü için 'F' eklemek gerekiyor
        double primitiveTypeDouble = 14.23; // double türü daha hassas bir sayıdır, 'F' eklemeye gerek yok

        boolean primitiveTypeBoolean = true; // boolean türü sadece true veya false değerini alabilir
        char primitiveTypeChar = 'a'; // char bir karakteri temsil eder, tek tırnak kullanılır

        ////////////////////////////////////////////////
        // WRAPPER TYPE (new varsa eski kullanım)
        // Wrapper türleri, ilkel türlerin nesne karşılıklarıdır ve null değeri alabilirler.

        Byte wrapperTypeByte = Byte.valueOf((byte) 127); // Autoboxing ile Byte wrapper nesnesi oluşturuluyor
        // wrapperTypeByte=null; // Wrapper türler null olabilir, ancak dikkatli kullanılmalı.
        System.out.println(wrapperTypeByte);  // Çıktı: 127

        Short wrapperTypeShort = Short.valueOf((short) 32767); // valueOf() ile Short wrapper nesnesi oluşturuluyor
        Integer wrapperTypeInt = Integer.valueOf(2147483647); // Integer sınıfı için valueOf kullanılıyor
        Long wrapperTypeLong = Long.valueOf(9223372036854775807L); // Long sınıfı için valueOf kullanılıyor
        Float wrapperTypeFloat = Float.valueOf(14.23F); // Float sınıfı için valueOf kullanılıyor
        Double wrapperTypeDouble = Double.valueOf(14.23); // Double sınıfı için valueOf kullanılıyor

        Boolean wrapperTypeBoolean = Boolean.valueOf(true); // Boolean sınıfı için valueOf kullanılıyor
        Character wrapperTypeChar = Character.valueOf('a'); // Character sınıfı için valueOf kullanılıyor

        // Unboxing işlemleri de otomatik olarak gerçekleşir, örneğin:
        int extractedInt = wrapperTypeInt;  // Autoboxing (Integer -> int)
        System.out.println(extractedInt);  // Çıktı: 2147483647
    }
}
