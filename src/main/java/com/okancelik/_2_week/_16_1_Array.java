package com.okancelik._2_week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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
        //String[] city = {"Diyarbakır", "İstanbul","İzmir","null","Ankara","Yalova"};
        String[] city = {"Diyarbakır", "İstanbul","İzmir","Ankara","Yalova"};

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
        for (int i = 0; i < city.length ; i++){
        System.out.println(_15_4_SpecialColor.YELLOW+city[i]+_15_4_SpecialColor.RESET);
        }
    }



    public static void arrayMethod4() {

    String[] city = arrayMethod2();

    // for each
        for(String temp : city){
            System.out.println(_15_4_SpecialColor
                    .GREEN+temp+_15_4_SpecialColor.RESET);
        }
    }
    // (alfabetik olarak)Arrays.short() küçükten büyüğe doğru sıralama
    public static void arrayMethod5() {

        String[] city = arrayMethod2();
        //dizilerde sıralama
       // küçükten büyüğe doğru sıralama

        Arrays.sort(city);

        // for each
        for (int i = 0; i < city.length ; i++){
            System.out.println(_15_4_SpecialColor.YELLOW+city[i]+_15_4_SpecialColor.RESET);
        }
    }

    // Arrays.sort(city, Collections.reverseOrder()) doğru sıralama büyükten küçüğe doğru sıralama (alfabetik olarak?
    public static void arrayMethod6() {

        String[] city = arrayMethod2();
        //dizilerde sıralama
        // büyükten küçüğe doğru sıralama

        Arrays.sort(city, Collections.reverseOrder());

        // for each
        for (int i = 0; i < city.length ; i++){
            System.out.println(_15_4_SpecialColor.YELLOW+city[i]+_15_4_SpecialColor.RESET);
        }
    }

    public static int randomNumber(){
        Random random = new Random();
        int rndInt = random.nextInt(9)+1;
        return rndInt;
    }

// fill
    public static void arrayMethod7() {

        int[] number =new int[7];
        // fill methodu tek bir değeri dizinin tüm elemanlarına atamak için tasarlanmıştır.

        Arrays.fill(number,randomNumber()); // fill in anlamı 5 sayısı ile diziyi doldurdu.

       // iterative for ile her defasında farklı bir sayı  gelsin
        for(int i = 0; i<number.length ; i++){
           // number[i]=randomNumber(); 1 YOL
            Arrays.setAll(number, data -> randomNumber()); // (2.YOL)
            }

        // for each
        for (int temp : number){
            System.out.println(_15_4_SpecialColor.BLUE+ temp + _15_4_SpecialColor.RESET);
        }
    }


    //psvm
    public static void main(String[] args) {

        // arrayMethod1();
        //arrayMethod2();
        //arrayMethod3();
        //arrayMethod4();
        // arrayMethod5();
        //arrayMethod6();
        arrayMethod7();

        // methot2 ile methot1 içindeki  dizi işlemlerini bu
        // kullanım sayesinde ekrana çıktı olarak verebiliyoruz.

    }

}//end  class
