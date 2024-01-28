package org.test.TestOnlineSchoolMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolMVC.entity.Homework;

public interface HomeworkRepo extends JpaRepository<Homework, Long> {
}
