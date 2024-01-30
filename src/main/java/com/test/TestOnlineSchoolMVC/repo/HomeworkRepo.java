package com.test.TestOnlineSchoolMVC.repo;

import com.test.TestOnlineSchoolMVC.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepo extends JpaRepository<Homework, Long> {
}
