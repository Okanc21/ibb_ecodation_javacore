package com.okancelik.tutorials._2_week;

import java.util.Scanner;

public class _09_5_Conditional_SwichCase {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();

        System.out.println("lütfen bir sayı giriniz: ");

        if( number ==1){
            System.out.println("sayı 1");
        }else if(number==2){
            System.out.println("sayı 2");
        }else if(number==3){
            System.out.println("sayı 3");
        }else if(number==4){
            System.out.println("sayı 4");
        }else if(number==5){
            System.out.println("sayı 5");
        }else{
            System.out.println(number +" 1<= NUMBER <=5 dışındadır.");
        }

        switch (number){
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println("number +\" 1<= NUMBER <=5 dışındadır.\"");
        }







    }
}
