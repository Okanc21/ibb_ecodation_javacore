package com.okancelik.project_step2_file;

/* Öğrenci Yönetim Sistemi */

import com.okancelik.project_step1_file.StudentDto;
import com.okancelik.utils.SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

        // field
    private ArrayList<com.okancelik.project_step1_file.StudentDto> studentDtoList= new ArrayList<>();
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

        studentDtoList=(ArrayList<com.okancelik.project_step1_file.StudentDto>) objectInputStream.readObject();
        studentCounter= studentDtoList.size();
        System.out.println(SpecialColor.BLUE+"dosyadan yüklenen öğrenci sayısı"+ SpecialColor.RESET);
    }catch(FileNotFoundException fileNotFoundException){

        System.out.println(SpecialColor.RED+ "dosyadan yüklenen öğrenci bulunamadı "+SpecialColor.RESET);
        fileNotFoundException.printStackTrace();
    }catch(IOException io){

        System.out.println(SpecialColor.RED+ "dosya okuma hatası "+SpecialColor.RESET);
        io.printStackTrace();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    }



    // //////////////////////////////////////////////////////
    // Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate,Date createdDate
    // öğrenci ekle
    public void add(com.okancelik.project_step1_file.StudentDto dto){
        studentDtoList.add(new com.okancelik.project_step1_file.StudentDto(++studentCounter, dto.getName(), dto.getSurname(),dto.getMidTerm(),dto.getFinalTerm(),dto.getBirthDate()));
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
            System.out.println(SpecialColor.BLUE+"öğrenci listesi:"+SpecialColor.RESET);
            studentDtoList.forEach(System.out::println);
        }
    }


    // öğrenci ara
    public void search (String name){
        /* studentDtoList.stream()
                .filter(temp-> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);*/

        // eğer öğrenci varsa true dönder.
        boolean found=studentDtoList
                .stream()
                .filter(temp-> temp.getName().equalsIgnoreCase(name))
                .peek(System.out::println) // eğer ilgili bir data varsa yazdır
                .findAny() // herhangi bir eşleşen öğrenci var mı yok mu ? kontrol et
                .isPresent();
        // öğrenci yoksa
        if(!found){
            throw  new StudentNotFoundException (name+"isimli öğrenci bulunamadı");
        }


    }

    // öğrenci güncelle

    public void upDate(int id, com.okancelik.project_step1_file.StudentDto dto){

        for(com.okancelik.project_step1_file.StudentDto temp: studentDtoList){
            if(temp.getId()==id){
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setMidTerm(dto.getMidTerm());
                temp.setFinalTerm(dto.getFinalTerm());
                // güncellenmiş öğrenci bilgileri
                System.out.println(SpecialColor.BLUE+temp+"öğrenci  bilgileri güncellendi" + SpecialColor.RESET);
                //dosyaya kaydet
                saveToFile();
                return;

            }

        }
        System.out.println(SpecialColor.RED+"öğrenci bulunamadı"+ SpecialColor.RESET);
    }

    // öğrenci sil
    public void delete(int id){
        //studentDtoList.removeIf(temp -> temp.getId()==id);
        boolean removed  = studentDtoList.removeIf(temp-> temp.getId()==id);
        if(removed){
            System.out.println(SpecialColor.BLUE+"öğrenci silindi" + SpecialColor.RESET);
            // silinen öğrenciyi dosyaya kaydet
            saveToFile();
        }else{
            System.out.println(SpecialColor.BLUE+"öğrenci  silinmedi" + SpecialColor.RESET);

        }

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
            System.out.println(" 1.öğrenci ekle");
            System.out.println(" 2.öğrenci listele");
            System.out.println(" 3.öğrenci ara");
            System.out.println(" 4.öğrenci güncelle");
            System.out.println(" 5.öğrenci sil");
            System.out.println(" 6.öğrenci toplam öğrenci sayısı");
            System.out.println(" 7.öğrenci rastgele ");
            System.out.println(" 8.öğrenci not hesapla");
            System.out.println(" 9.öğrenci en yüksek, en düşük notları göster");
            System.out.println(" 10.öğrenci sıralaması doğum gününe göre göster");
            System.out.println(" 11. çıkış");
            System.out.println("lütfen seçiminizi yapınız");

            // seçim yapacak
             int chooise = scanner.nextInt();
            scanner.nextLine();// durma yerimiz

            switch (chooise){
                case 1: // öğrenci eklemek
                    System.out.println("öğrenci adı");
                    String name =scanner.nextLine();

                    System.out.println("öğrenci soyadı");
                    String surname =scanner.nextLine();

                    System.out.println("öğrencin doğum tarihi YYYY-MM-DD");
                    LocalDate birthDate = LocalDate.parse(scanner.nextLine());

                    System.out.println("öğrenci vize puanı");
                    double midTerm = scanner.nextDouble();

                    System.out.println("öğrenci final puanı");
                    double finalTerm = scanner.nextDouble();


                    // studentDto.setBirthDate(birthDate);
                    studentManagementSystem.add(new StudentDto(++studentCounter, name , surname, midTerm, finalTerm,birthDate));
                    break;

                case 2:// listelemek
                    studentManagementSystem.list();;
                    break;
                case 3: // öğrenci ara
                    studentManagementSystem.list();
                    System.out.println(SpecialColor.BLUE+"aranacak öğrenci ismini yazınız" + SpecialColor.RESET);
                    String searchName= scanner.nextLine();
                    studentManagementSystem.search(searchName);


                   break;
                case 4: // öğrenci güncelle
                    studentManagementSystem.list();
                    System.out.println("güncelleme yapılacak öğrenci id sini giriniz ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // eğer id sonraso string  gelecekse bunu yazmalıyız.

                    System.out.println("yeni öğrenci soyadı");
                    String nameUpdate =scanner.nextLine();

                    System.out.println("yeni öğrenci soyadı");
                    String surnameUpdate =scanner.nextLine();

                    System.out.println("öğrencin doğum tarihi YYYY-MM-DD ");
                    LocalDate birthDateUpdate = LocalDate.parse(scanner.nextLine());

                    System.out.println("öğrenci vize puanı");
                    double midTermUpdate = scanner.nextDouble();

                    System.out.println("öğrenci final puanı");
                    double finalTermUpdate = scanner.nextDouble();


                    // studentDto.setBirthDate(birthDate);
                    StudentDto studentDtoUpdate = StudentDto.builder()
                            .name(nameUpdate)
                            .surname(surnameUpdate)
                            .midTerm(midTermUpdate)
                            .finalTerm(finalTermUpdate)
                             .birthDate(birthDateUpdate)
                                     .build();
                    try{
                        studentManagementSystem.upDate(id,studentDtoUpdate);

                    }catch (StudentNotFoundException e) {
                        System.out.println(SpecialColor.RED + e.getMessage());
                        e.printStackTrace();

                    }
                    break;
                case 5: // öğrenci sil
                    studentManagementSystem.list();
                    System.out.println(SpecialColor.BLUE+"silinecek öğrenci id si" + SpecialColor.RESET);
                    int deleteID= scanner.nextInt();
                    studentManagementSystem.delete(deleteID);
                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:
                    System.out.println();

                    break;
                case 8:
                    System.out.println();

                    break;
                case 9:
                    System.out.println();

                    break;
                case 10:
                    System.out.println();

                    break;
                case 11:
                    System.out.println("sistemden çıkış yapılıyor.");
                    System.exit(0);
                    //return; // bunu yazarsak break gerek yok

                    break;
                default:
                    System.out.println("geçersiz seçim yaptınız lütfen tekrar deneyiniz.");

                    break;


            }

        }

    }



}
