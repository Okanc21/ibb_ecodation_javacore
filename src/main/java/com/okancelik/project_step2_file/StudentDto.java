package com.okancelik.project_step2_file;

import com.okancelik.utils.SpecialColor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

// Lombok anotasyonları
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class StudentDto implements Serializable {

    private static final long serialVersionUID = 1L;

    // Alanlar (Fields)
    private Integer id;
    private String name;
    private String surname;
    private Double midTerm; // Vize notu
    private Double finalTerm; // Final notu
    private Double resultTerm; // Sonuç notu: vize %40 + final %60
    private LocalDate birthDate; // Doğum tarihi
    private Date createdDate; // Sisteme kayıt tarihi

    // Static blok (Nesne boyunca bir kere çalışır)
    static {
        System.out.println(SpecialColor.BLUE + "Static StudentDto yüklendi" + SpecialColor.RESET);
    }

    // Parametresiz constructor
    public StudentDto() {
    }

    // Parametreli constructor
    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.birthDate = birthDate;
        this.resultTerm = calculateResult();
        this.createdDate = createdDate;
    }

    // Not hesaplama metodu
    private Double calculateResult() {
        if (midTerm == null || finalTerm == null) {
            return 0.0;
        } else {
            return (midTerm * 0.4 + finalTerm * 0.6);
        }
    }

    // Vize ve Final değiştiğinde otomatik olarak sonucu günceller
    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm = calculateResult();
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
    }
}
