package com.okancelik.tutorials._2_week;

public class _10_3_Loop_DoWhile {

// do while şart sağlansın  ya da sağlanmasın bir kere çalışır.


    public static void main(String[] args) {

        int i = 1;
        do{
            System.out.print(i+"-");
            i++;
        }while( i< 10);

        // while döngüsünde sonsuzluk
        // while (;true){}

        int number = 1;
        for(;;){
            System.out.println(number);
            number++;
            if(number>=50)
                break;
        }


    }



}
