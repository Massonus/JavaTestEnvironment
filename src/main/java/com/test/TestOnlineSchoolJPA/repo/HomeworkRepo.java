package com.test.TestOnlineSchoolJPA.repo;

import com.test.TestOnlineSchoolJPA.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepo extends JpaRepository<Homework, Long> {
}
