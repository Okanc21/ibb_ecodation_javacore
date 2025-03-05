package com.okancelik._2_week;

public class _12_1_String1 {


    public static void main(String[] args) {

        //1.YOL
        //String vocabulary = new String(" Java öğreNİYOrum");
        //2.YOL
        //String vocabulary = new String();

        //3.YOL
        //vocabulary =" Java öğreNİYOrum";
        String vocabulary1=" Java öğreNİYOrum ";// boşluk bir karakterdir.
        String vocabulary2=" Java öğreNİYOrum ";

        //length(
        System.out.println("Harf sayısı:"+ vocabulary1.length());

        // toUppercase()=>  hepsini BÜYÜK  karakter yap
        // toLowerCase()=> hepsini küçük harf yap
        System.out.println("BÜYÜK HARF:"+ vocabulary1.toUpperCase());
        System.out.println("küçük harf:"+ vocabulary1.toLowerCase());



        //trim: başındaki veya sonundaki boşlukları alır.
        System.out.println("Trim: "+ vocabulary1.trim().length());
        System.out.println("Trim: "+ vocabulary1.trim());


        //equals eşit mi diye sorar
        System.out.println(vocabulary1 == vocabulary2);
        System.out.println("equals: "+vocabulary1.equals(vocabulary2));
        System.out.println("equalsIgnoreCase: "+vocabulary1.equalsIgnoreCase(vocabulary2));


        //StartsWith() ile mi başlıyor
        //endsWith() ile mi bitiyor
        System.out.println(vocabulary1.startsWith("J")+ "ile mi başlıyor");
        System.out.println(vocabulary1.endsWith(" ")+ "ile mi bitiyor");


        //charAt: sıfırdan  saymaya başlar ve verdiğimiz sayı  kelimenin ilgili harfini bize verir.
        System.out.println(vocabulary1.charAt(1));

        // subString: parçalama 2 yöntem var.
        // 1: Süpürme
        // 2: Aralarında
        System.out.println(vocabulary1.substring(1));
        System.out.println(vocabulary1.trim().substring(1));
        System.out.println(vocabulary1.trim().substring(1).toLowerCase());

        System.out.println(vocabulary1.substring(1,10)); // 1<=VOCABUL<=10-1
        String vocabulary3="java";

        if(vocabulary3.length()>=10){
            // StringIndexOutOfBoundsException
            System.out.println(vocabulary3.substring(1,10)); // 1<=VOCABUL<=10-1
        }else{
            System.out.println("Verdiğiniz kelime en fazla: "+vocabulary3.length()+ " karakter vardır");
        }

        //Contains
        System.out.println("Geçiyor mu?"+vocabulary1.contains("Java"));

        // Split

        // Replace
        vocabulary1=vocabulary1.replace("Java","Java 2025");
        //System.out.println("Değiştir: "+vocabulary1.replace("Java","Java 2025"));
        System.out.println(vocabulary1);

        // Birleştirme
        String concatenation=vocabulary1+vocabulary2+vocabulary3;
        System.out.println(concatenation);
        // Birleştirme (Concat)
        System.out.println(vocabulary1.concat(" jsp").concat(" jsf"));

        // Birleştirme (StringBuilder)
        String dataToString1= vocabulary1 + " jsp" + " jsf";
        System.out.println(dataToString1);

        // Birleştirme (StringBuffer)
        String dataToString2= vocabulary1 + " jsp" + " jsf";
        System.out.println(dataToString2);

        // Hash code
        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());
        System.out.println(vocabulary3.hashCode());

    }


}
