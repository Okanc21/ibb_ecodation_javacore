package com.okancelik._2_week;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_3_LocalDateTime {
// yeni nesil  Date
    //LocalDateTime1
    public static void localDateFormatGetMethot(){

        LocalDateTime now= LocalDateTime.now();
        Locale locale = new Locale("tr", "TR");

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");


        //normal çıktı

        System.out.println("Şu andaki zaman: " + now);
        System.out.println("Şu andaki zaman: " + now.format(formatter));
    }

    //LocalDateTime2
    public static void localDateFormatGetMethot2() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("gün: " + now.getDayOfMonth());
        System.out.println("kaçıncı ay:" + now.getDayOfWeek().getValue());
        System.out.println("Yıl: " + now.getYear());
        System.out.println("saat:" + now.getHour());
        System.out.println("dakika:" + now.getMinute());
        System.out.println("saniye:" + now.getSecond());
        System.out.println("################################");

    }

    public static void localdateFormatSetMethod1() {

        Locale locale = new Locale("tr", "TR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss", locale);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newData= now
                .withDayOfMonth(11) //
                .withMonth(12)  //
                .withYear(2029)
                .withHour(14)
                .withMinute(44)
                .withSecond(23);
        //System.out.println(now);
        System.out.println("Normal Tarih: "+now);
        System.out.println("Değiştirilmiş Tarih: "+newData.format(formatter));

    }


//psvm
    public static void main(String[] args) {
       //localDateFormatGetMethot();
        //localDateFormatGetMethot2();
        localdateFormatSetMethod1();


    }

}
