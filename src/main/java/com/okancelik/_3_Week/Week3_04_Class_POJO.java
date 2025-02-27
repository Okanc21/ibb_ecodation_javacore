package com.okancelik._3_Week;


// POJO : Plain Old Java Object
// Sadece field + getter and setter ın olduğu kısımlar

import com.okancelik.utils.SpecialColor;

// this : global nesneye işaret eder.
public class Week3_04_Class_POJO {

    //field
    private String name;
    private String surname;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase(); // soy isim büyük harflerle yazıldı.
    }

    public static void main(String[] args) {
        Week3_04_Class_POJO pojo = new Week3_04_Class_POJO();
        pojo.setName("okan");
        pojo.setSurname("çelik");
        String nameAndSurname=pojo.getName().toString()+" "+pojo.getSurname().toString();
        System.out.println(SpecialColor.BLUE+nameAndSurname+SpecialColor.RESET);



    }




}
