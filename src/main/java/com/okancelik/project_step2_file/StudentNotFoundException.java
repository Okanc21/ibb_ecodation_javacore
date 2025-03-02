package com.okancelik.project_step2_file;

// öğrenci bulunamazsa fırlatılacak özel exception
public class StudentNotFoundException extends RuntimeException {


    public StudentNotFoundException(String message) {
        super(message);
    }
}
