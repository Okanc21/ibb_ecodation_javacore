package com.okancelik._2_week;

import java.util.Scanner;

public class week2_Examples_1 {

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz:");

        int number = klavye.nextInt();
        // validation
        // 1- kullanıcı  pozitif bir sayı girmezse
        // 2- kullanıcı harf girerse
        // 3- sıfır (çift)
        if(number%2==0){
            System.out.println(number+ " sayı çift sayıdır");

        }else{
            System.out.println(number+ " sayı tek sayıdır");
        }

    }
}
