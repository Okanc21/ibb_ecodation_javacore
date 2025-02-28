package com.okancelik.project_step1_file;

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
    private LocalDate birthDate;
    private Date createdDate;
    private Double grade; // başarı puanı

// static nesne boyunca bir kere oluşturulur.
    static{

    }



    // parametresiz constructor
    public StudentDto() {
    }

    // parametreli constructor


    public StudentDto(Integer id, String name, String surname, LocalDate birthDate, Double grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.grade = grade;
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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}// end student
