package com.test.TestOnlineSchoolMVC.repo;

import com.test.TestOnlineSchoolMVC.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
