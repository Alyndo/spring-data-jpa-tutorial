package com.alwyncodebuffer.springdatajpatutorial.repository;

import com.alwyncodebuffer.springdatajpatutorial.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
