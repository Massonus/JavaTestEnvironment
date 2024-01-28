package org.test.TestTask57.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestTask57.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
