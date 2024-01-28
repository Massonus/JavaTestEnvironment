package org.test.TestOnlineSchoolJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolJPA.entity.Homework;

public interface HomeworkRepo extends JpaRepository<Homework, Long> {
}
