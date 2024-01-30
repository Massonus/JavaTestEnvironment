package com.test.TestOnlineSchoolJPA.repo;

import com.test.TestOnlineSchoolJPA.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepo extends JpaRepository<Lecture, Long> {
}
