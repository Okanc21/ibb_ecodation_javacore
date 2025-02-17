package com.okancelik._1_week;

public class _04_4_Autoboxing_Boxing {

    public static void main(String[] args) {

        // Primitive => wrapper Type dönüştürmek

        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("primitive type : " +primitiveValue+" wrapper type "+wrapperValue);


        // Wrapper => Primitive Type dönüştürmek

        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue; // Unboxing
        System.out.println("wrapper type2: " + wrapperValue2 +" primitive type2 "+primitiveValue2);





    }
}
