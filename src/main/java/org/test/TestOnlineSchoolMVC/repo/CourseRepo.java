package org.test.TestOnlineSchoolMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolMVC.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
