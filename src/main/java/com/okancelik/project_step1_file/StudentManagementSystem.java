package com.okancelik.project_step1_file;

import com.okancelik.utils.SpecialColor;
import com.okancelik.project_step2_file.StudentDto;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManagementSystem {

    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    public StudentManagementSystem() {
        loadStudentsListFromFile();
    }

    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(studentDtoList);
        } catch (IOException io) {
            System.out.println(SpecialColor.RED + "Dosya ekleme hatası" + SpecialColor.RESET);
            io.printStackTrace();
        }
    }

    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
        } catch (FileNotFoundException e) {
            System.out.println(SpecialColor.RED + "Öğrenci kaydı bulunamadı" + SpecialColor.RESET);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(SpecialColor.RED + "Dosya okuma hatası" + SpecialColor.RESET);
        }
    }

    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(
                ++studentCounter,
                dto.getName(),
                dto.getSurname(),
                dto.getMidTerm(),
                dto.getFinalTerm(),
                dto.getBirthDate(),
                new Date(System.currentTimeMillis())
        ));
        System.out.println(SpecialColor.YELLOW + " Öğrenci eklendi" + SpecialColor.RESET);
        saveToFile();
    }

    public void list() {
        if (studentDtoList.isEmpty()) {
            System.out.println(SpecialColor.RED + " Öğrenci yoktur" + SpecialColor.RESET);
        } else {
            studentDtoList.forEach(System.out::println);
        }
    }

    public void upDate(int id, StudentDto dto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setMidTerm(dto.getMidTerm());
                temp.setFinalTerm(dto.getFinalTerm());
                temp.setResultTerm(dto.getResultTerm());
                System.out.println(SpecialColor.GREEN + "Öğrenci güncellendi" + SpecialColor.RESET);
                saveToFile();
                return;
            }
        }
        System.out.println(SpecialColor.RED + "Öğrenci bulunamadı" + SpecialColor.RESET);
    }

    public void delete(int id) {
        studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println(SpecialColor.BLUE + "Öğrenci silindi" + SpecialColor.RESET);
        saveToFile();
    }

    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        while (true) {
            System.out.println("\n 1. Öğrenci ekle");
            System.out.println("\n 2. Öğrenci listele");
            System.out.println("\n 3. Öğrenci güncelle");
            System.out.println("\n 4. Öğrenci sil");
            System.out.println("\n 5. Çıkış");
            System.out.println("\nLütfen seçiminizi yapınız");

            int chooise = scanner.nextInt();
            scanner.nextLine();
            StudentDto studentDto = new StudentDto();

            switch (chooise) {
                case 1:
                    System.out.println("Öğrenci adı:");
                    studentDto.setName(scanner.nextLine());

                    System.out.println("Öğrenci soyadı:");
                    studentDto.setSurname(scanner.nextLine());

                    System.out.println("Vize notu:");
                    studentDto.setMidTerm(scanner.nextDouble());

                    System.out.println("Final notu:");
                    studentDto.setFinalTerm(scanner.nextDouble());

                    studentManagementSystem.add(studentDto);
                    break;
                case 2:
                    studentManagementSystem.list();
                    break;
                case 5:
                    return;
            }
        }
    }
}
