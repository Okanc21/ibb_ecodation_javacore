package com.okancelik._3_Week;

import java.util.Date;
import java.util.Objects;
//1. kullanıcının soy isminin ilk 3 harfini büyük yazınız ve soyismi eğer
// üç harften fazlaysa geri kalan harflerinin yerine yıldız ekleyin.
// okan ÇEL**(maskeleme)
// tip (loop, conditional)

//2. isim ve soy isim birlikte ayarlanırken isim baş harfi büyük geriye kalan küçük olacak şekilde ayarlanabilir mi?
//3. isim ve soyisim birilikte dönen bir methot oluşturabilir mi?
//4. soyisimde noktalama işaretleri olup olmadığını kontrol eden bir doğrulama ekleyebilir mi ?
//5. İsim veya soyisim boş girildiğinde bir değer atanabilir mi?
//6. İsim ve soyisimde sadece harfler olup olmadığını kontrol edebilir miyiz?
//7. Kullanıcıdan isim ve soyisim girerken karakter sınırı koyabilir miyiz?
//8. İsim veya soyismi tamamen büyük harfe çevirecek bir metod ekleyebilir miyiz?


public class Week3_05_Class_BEAN {

    // Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    // Constructor Metot(parametresiz)
    public Week3_05_Class_BEAN() {
        id = 0L;
        name = "isim alanını yazmadınız";
        this.surname = "soyisim alanını yazmadınız";
        this.createdDate = new Date(System.currentTimeMillis());
    }

    // Constructor(parametreli)
    public Week3_05_Class_BEAN(Long id, String name, String surname, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    // Constructor(parametreli)
    public Week3_05_Class_BEAN(String name, String surname) {
        id = 0L;
        this.name = name;
        this.surname = surname;
        this.createdDate = new Date(System.currentTimeMillis());
    }

    // Method
    public String fullName() {
        return id + " " + name + " " + this.surname + " " + createdDate;
    }

    // toString
    @Override
    public String toString() {
        return "Week3_05_Class_BEAN{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", createdDate=" + createdDate + '}';
    }

    // Equals And HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Week3_05_Class_BEAN bean = (Week3_05_Class_BEAN) o;
        return Objects.equals(id, bean.id) && Objects.equals(name, bean.name) && Objects.equals(surname, bean.surname) && Objects.equals(createdDate, bean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, createdDate);
    }

    // Getter And Setter
    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = "Okan";
        }
    }

    // SURNAME
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || !surname.matches("[a-zA-ZğüşıöçĞÜŞİÖÇ]+")) {
            throw new IllegalArgumentException("Soyisim sadece harf içermelidir!");
        } else if (surname.length() >= 3) {
            this.surname = surname.substring(0, 3).toUpperCase() + "*".repeat(surname.length() - 3);
        } else {
            this.surname = surname.toUpperCase();
        }
    }

    // DATE
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    // PSVM
    public static void main(String[] args) {
        try {
            Week3_05_Class_BEAN bean1 = new Week3_05_Class_BEAN();
            bean1.setId(1L);
            bean1.setName("Okan");
            bean1.setSurname("Çelik");
            System.out.println(" " + bean1 + " ");
        } catch (IllegalArgumentException e) {
            System.err.println("Hata: " + e.getMessage());
        }
    }
}
