package com.test.TestOnlineSchoolJPA.repo;

import com.test.TestOnlineSchoolJPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
