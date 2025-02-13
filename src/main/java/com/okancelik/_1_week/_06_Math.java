package com.okancelik._1_week;

public class _06_Math {

    public static void main(String[] args) {
        // NaN: a Number
        System.out.println("En küçük: "+Math.min(3,10)); // küçük olanı çeker. 3
        System.out.println("En büyük: "+Math.max(3,10)); // büyük olanı çeker. 10

        System.out.println("Mutlak: "+Math.abs(-152)); // mutlak değer aldırır. 152

        System.out.println("Karekök: "+Math.sqrt(36)); // karekök alır. 6
        System.out.println("Karekök: "+Math.sqrt(-36)); // negatif sayının karekökü olmaz. NaN
        System.out.println("Karekök: "+Math.sqrt(Math.abs(-36)));// iç içe yazıldığında sistem düzgün çalışır. 6

        System.out.println("Üslü: "+Math.pow(2,3));// üs aldırır parantez içi 2 üzeri 3 diye okutur. 8

        System.out.println("Alta yuvarla: "+Math.floor(3.9));// alta yuvarlar yani 3
        System.out.println("Üste yuvarla: "+Math.ceil(3.2));// üste yuvarlar yani 4

        System.out.println("Ortalama: "+Math.round(3.4)); // aşağı yuvarlar 3
        System.out.println("Ortalama: "+Math.round(3.5));// x>= 5 yukarı yuvarlar 4

        System.out.println("PI Sayısı: "+Math.PI); // pi sayısını bastırır
        System.out.println("E Sayısı: "+Math.E);

        System.out.println("trigonometrik Sinüs : "+Math.sin(1));  // sin değerini bastırır.
        System.out.println("trigonometrik aSinüs : "+Math.asin(1));// sinin tersinin bastırır.
        System.out.println("trigonometrik Cosinüs : "+Math.cos(1)); // cosinüs değerrini bastırır.
        System.out.println("trigonometrik Tanjant : "+Math.tan(1));//tanjant değerni bastırır.










    }
}
