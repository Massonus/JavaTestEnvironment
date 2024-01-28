package org.test.TestTask57.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestTask57.entity.Lecture;

public interface LectureRepo extends JpaRepository<Lecture, Long> {
}
