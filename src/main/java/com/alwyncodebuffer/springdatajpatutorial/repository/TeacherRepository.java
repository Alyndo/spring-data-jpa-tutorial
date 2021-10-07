package com.alwyncodebuffer.springdatajpatutorial.repository;

import com.alwyncodebuffer.springdatajpatutorial.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
