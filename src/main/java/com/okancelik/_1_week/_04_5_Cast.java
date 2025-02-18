package com.okancelik._1_week;

public class _04_5_Cast {

    public static void main(String[] args) {


        // 1- widening Cast - Implicit Cast
        byte cast1Byte = 100; // küçük olan veriyi
        int cast1Int = cast1Byte;// büyük olan verinin içine ekledim burda veri kaybı yoktur
        System.out.println(cast1Int);

        //2- Narrowing Cast -explicit cast
        int cast2Int=999999999;
        byte cast2Byte=(byte)cast2Int;
        System.out.println(cast2Byte);

        //3- char => Int
        char cast3Char ='O';
        int  ascii = cast3Char;
        System.out.println(cast3Char+" harfi ascii olarak karşılığı: "+ ascii);

        int cast3Int= 38;
        char ascii2= (char) cast3Int;
        System.out.println(cast3Int+" sayısının ascii karşılığı : " + ascii2);


    }
}
