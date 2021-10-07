package com.alwyncodebuffer.springdatajpatutorial.repository;

import com.alwyncodebuffer.springdatajpatutorial.entity.Guardian;
import com.alwyncodebuffer.springdatajpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("alwyn@gmail.com")
                .firstName("Alwyn")
                .lastName("Munatsi")
                //.guardianName("Selwyn Munatsi")
                //.guardianEmail("selwyn@yahoo.com")
                //.guardianMobile("0772482187")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("caris@gmail.com")
                .name("Caris Munatsi")
                .mobile("0772000187")
                .build();

        Student student = Student.builder()
                .firstName("Fiona")
                .lastName("Maronje")
                .emailId("fiona@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList =" + studentList);
    }

    @Test
    public void  printStudentByFirstName(){

        List<Student> students = studentRepository.findByFirstName("Fiona");

        System.out.println("students =" + students);
    }

    @Test
    public void  printStudentByFirstNameContaining(){

        List<Student> students = studentRepository.findByFirstNameContaining("on");

        System.out.println("students =" + students);
    }

    @Test
    public void  printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Caris");
        System.out.println("students =" + students);
    }

    @Test
    public void printStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress(
                "alwyn@gmail.com"
        );

        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress(){
        String firstName = studentRepository.getStudentFirstNameByEmailAddress(
                "fiona@gmail.com"
        );
        System.out.println("firstName =" + firstName);
    }

    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative(
                "alwyn@gmail.com"
        );
        System.out.println("student =" + student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNamedParam(){
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam(
                "alwyn@gmail.com"
        );
        System.out.println("student =" + student);
    }

    @Test
    public void updateStudentNameByEmailId(){
        studentRepository.updateStudentNameByEmailId(
                "Mufaro",
                "fiona@gmail.com"
        );
    }

    @Test
    public void updateEmailIdByFirstName(){
        studentRepository.updateEmailIdByFirstName(
                "munatsialwyn@gmail.com",
                "Alwyn"
        );
    }
}