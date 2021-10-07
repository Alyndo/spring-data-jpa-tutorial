package com.alwyncodebuffer.springdatajpatutorial.repository;

import com.alwyncodebuffer.springdatajpatutorial.entity.Course;
import com.alwyncodebuffer.springdatajpatutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(7)
                .build();

        Course courseMaths = Course.builder()
                .title("Maths")
                .credit(9)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Selwyn")
                .lastName("Munatsi")
                //.courses(List.of(courseDBA, courseJava, courseMaths))
                .build();

        teacherRepository.save(teacher);
    }

}