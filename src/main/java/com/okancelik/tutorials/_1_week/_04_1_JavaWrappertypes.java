package com.okancelik.tutorials._1_week;

public class _04_1_JavaWrappertypes {

    public static void main(String[] args) {
        // PRİMİTİVE TYPE
        byte primitiveTypeByte=127;
        //primitiveTypeByte=null; primitive type null değer veremezsiniz.
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort =32767;
        int primitivetypeInt = 2147483647;
        long primitiveTypeLong = 9223372036854775807L;

        float primitiveTypeFloat=14.23F;
        double primitiveTypeDouble=14.23;

        boolean primitiveTypeBoolean=true;
        char primitiveTypeChar ='a';



        /// ////////////////////////////////////////////////
        // WRAPPER TYPE (new yoksa )
        byte wrapperTypeByte=127;
        // wrapperTypeByte=null;// null değer verebilirsiniz.
        System.out.println(wrapperTypeByte);
        Short wrapperTypeShort = 32767;
        Integer wrapperTypeInt = 2147483647;
        Long wrapperTypeLong = 9223372036854775807L;

        Float wrapperTypeFloat=14.23F;
        Double wrapperTypeDouble=14.23;

        Boolean wrapperTypeBoolean=true;
        Character wrapperTypeChar ='a';



    }
}
