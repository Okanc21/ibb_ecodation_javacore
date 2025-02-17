package com.okancelik._1_week;

import java.util.Scanner;

public class Week1_examples_1 {

    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Variable
        double aValue,bValue=0,result;

        System.out.println("Lütfen b değerini giriniz: ");
        bValue = scanner.nextDouble();

        System.out.println("Lütfen a değerini giriniz: ");
        aValue = scanner.nextDouble();

        //ax+b x = b/a

        result =(-bValue/aValue);
        System.out.println("a değeri: "+aValue+" b değeri: "+bValue+" Sonuç: "+result);
        scanner.close();


    }


}
