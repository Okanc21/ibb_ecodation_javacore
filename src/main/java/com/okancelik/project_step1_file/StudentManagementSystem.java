package com.okancelik.project_step1_file;

/* Öğrenci Yönetim Sistemi */

import com.okancelik.utils.SpecialColor;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManagementSystem {

        // field
    private ArrayList<StudentDto> studentDtoList= new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";


    //static
    static{

    }



    // parametresiz constructor
    public StudentManagementSystem() {
        // program başlarken öğrenci listesini hemen yüklesin
        loadStudentsListFromFile();

    }

    // //////////////////////////////////////////////////////

    // login

    //Register

    // ///////////////////////////////////////////////////////

    // fileIO create
    // öğrenci dosyalarını kaydeden method  file create
    private void saveToFile() {
        try(ObjectOutputStream objectoutputStream = new ObjectOutputStream( new FileOutputStream(FILE_NAME))){
            objectoutputStream.writeObject(studentDtoList);
        }catch(IOException io){

            System.out.println(SpecialColor.RED+ "dosya ekleme hatası "+SpecialColor.RESET);
            io.printStackTrace();
        }
    }

    //  öğrenci listesini oku file read
    //öğrenci listesini yükle (dosya)
    private void loadStudentsListFromFile() {
    try(ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(FILE_NAME))){

        studentDtoList=(ArrayList<StudentDto>) objectInputStream.readObject();
        studentCounter= studentDtoList.size();
    }catch(FileNotFoundException fileNotFoundException){

        System.out.println(SpecialColor.RED+ "öğrenci kaydı bulunamadı "+SpecialColor.RESET);
        fileNotFoundException.printStackTrace();
    }catch(IOException io){

        System.out.println(SpecialColor.RED+ "dosya okuma hatası "+SpecialColor.RESET);
        io.printStackTrace();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    }



    // //////////////////////////////////////////////////////

    // öğrenci ekle
    public void add(StudentDto dto){
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(),dto.getBirthDate(),dto.getGrade()));
        System.out.println(SpecialColor.YELLOW+ " öğrenci eklendi"+ SpecialColor.RESET);
        //file ekle
        saveToFile();

    }





    //öğrenci listesi
    public void list(){
        // öğrenci yoksa
        if(studentDtoList.isEmpty()){
            System.out.println(SpecialColor.RED+ " öğrenci yoktur"+ SpecialColor.RESET);
            return;
        }else{
            studentDtoList.forEach(System.out::println);
        }
    }


    // öğrenci ara
    public void search (String name){

        studentDtoList.stream()
                .filter(temp-> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);


    }

    // öğrenci güncelle

    public void upDate(int id,StudentDto dto){

        for(StudentDto temp: studentDtoList){
            if(temp.getId()==id){
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setGrade(dto.getGrade());
                System.out.println("öğrenci güncellendi");
                saveToFile();
                return;

            }

        }
        System.out.println(SpecialColor.RED+"öğrenci bulunamadı"+ SpecialColor.RESET);
    }

    // öğrenci sil
    public void delete(int id){
        studentDtoList.removeIf(temp -> temp.getId()==id);
        System.out.println(SpecialColor.BLUE+"öğrenci silindi"+SpecialColor.RESET);
        saveToFile();
    }


    // //////////////////////////////////////////////////////
    // toplam  öğrenci sayısı

    // rastgele öğrenci

    // öğrenci not ortalamasını hesapla

    // en yüksek not alan veya en dşük not alan öğrenci

    // öğrenci sıralaması (doğum günü)

    //console seçim (öğrenci ekle)
    public void chooise(){
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem= new StudentManagementSystem();

        // sonsuz while
        while(true){
            System.out.println("\n 1.öğrenci ekle");
            System.out.println("\n 2.öğrenci listele");
            System.out.println("\n 3.öğrenci ara");
            System.out.println("\n 4.öğrenci güncelle");
            System.out.println("\n 5.öğrenci sil");
            System.out.println("\n 6.öğrenci toplam öğrenci sayısı");
            System.out.println("\n 7.öğrenci rastgele ");
            System.out.println("\n 8.öğrenci not hesapla");
            System.out.println("\n 9.öğrenci en yüksek, en düşük notları göster");
            System.out.println("\n 10.öğrenci sıralaması doğum gününe göre göster");
            System.out.println("\n 11. çıkış");
            System.out.println("\nlütfen seçiminizi yapınız");

            int chooise = scanner.nextInt();
            scanner.nextLine();
            StudentDto studentDto=new StudentDto();
            String name, surname;
            String birthDate;
            double grade;

            switch (chooise){
                case 1:
                    System.out.println("öğrenci adı");
                    name =scanner.nextLine();
                    System.out.println("öğrenci soyadı");
                    surname =scanner.nextLine();
                    System.out.println("öğrencin doğum tarihi");
                    birthDate =scanner.nextLine().toString();
                    System.out.println("öğrenci başarı puanı");
                    grade =scanner.nextDouble();
                    studentDto.setId(studentCounter);
                    studentDto.setName(name);
                    studentDto.setSurname(surname);
                    studentDto.setCreatedDate(new Date(System.currentTimeMillis()));

                    // studentDto.setBirthDate(birthDate);
                    studentManagementSystem.add(studentDto);
                    break;

                case 2:
                    studentManagementSystem.list();;
                    break;
                case 3:
                studentManagementSystem.list();
                break;

            }

        }

    }



}
