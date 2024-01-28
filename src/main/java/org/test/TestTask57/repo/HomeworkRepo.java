package org.test.TestTask57.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestTask57.entity.Homework;

public interface HomeworkRepo extends JpaRepository<Homework, Long> {
}
