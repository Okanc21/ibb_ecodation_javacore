package com.okancelik.project_step1_file;

import com.okancelik.utils.SpecialColor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
//lombok
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode



//student
public class StudentDto implements Serializable {

    // serileştirme
    private static final long serialVersionUID =1L;


    //field
    private Integer id;
    private String name;
    private String surname;
    private Double midTerm; // vize notu
    private Double finalTerm; // final notu
    private Double resultTerm; // sonuç notu vize%40+ final%60
    private LocalDate birthDate; // dooğum günü
    private Date createdDate; // sistem otomatik tarihi

// static nesne boyunca bir kere oluşturulur.
    static{
    System.out.println(SpecialColor.BLUE+"Static StudentDto yüklendi"+SpecialColor.RESET);
    }



    // parametresiz constructor
    public StudentDto() {
    }

    // parametreli constructor

    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.birthDate = birthDate;
        this.resultTerm = calculateResult();
    }
    // methotlar
    // vize ve final hesaplaması
    private Double calculateResult() {
        if(midTerm==null  || finalTerm==null){
            return 0.0;
        }else {
            return (midTerm*0.4+finalTerm*0.6);
        }


    }


    // methot

    // getter and setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm= calculateResult();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm= calculateResult();

    }

    public Double getResultTerm() {
        return resultTerm;
    }

    public void setResultTerm(Double resultTerm) {
        this.resultTerm = resultTerm;
    }
}// end student
