package com.okancelik._2_week;

public class _16_1_Array {
    // Array

    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {

    String [] city = new String[6]; // eleman sayısı 6

        //String dizisi
        city [0]= "Diyarbakır";
        city [1]= "İstanbul";
        city [2]= "İzmir";
        city [3]= "Ankara";
        city [5]= "Yalova";

       // System.out.println(city);
       // System.out.println("eleman sayısı: " +city.length);
       // System.out.println(city[0]);
       // System.out.println(city[6-1]);
      //  System.out.println(city[4]);// null değer döndürür.
        System.out.println("Son eleman: " + city[city.length - 1]);
        return city;

    }
    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException {

        //String [] city = new String[6]; // eleman sayısı 6

        //String dizisi
        String[] city = {"Diyarbakır", "İstanbul","İzmir","null","Ankara","Yalova"};

        // System.out.println(city);
        // System.out.println("eleman sayısı: " +city.length);
        // System.out.println(city[0]);
        // System.out.println(city[6-1]);
        //  System.out.println(city[4]);// null değer döndürür.
        //System.out.println("Son eleman: " + city[city.length - 1]);
        return city;

    }
    public static void arrayMethod3() {

    String[] city = arrayMethod2();

    // for each
        for(String temp : city){
            System.out.println(_15_4_SpecialColor
                    .GREEN+temp+_15_4_SpecialColor.RESET);
        }



    }

    //psvm
    public static void main(String[] args) {

        // arrayMethod1();

        //arrayMethod2();
        arrayMethod3();

        // methot2 ile methot1 içindeki  dizi işlemlerini bu
        // kullanım sayesinde ekrana çıktı olarak verebiliyoruz.

    }

}//end  class
