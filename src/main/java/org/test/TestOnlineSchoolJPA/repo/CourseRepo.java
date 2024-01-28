package org.test.TestOnlineSchoolJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolJPA.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
