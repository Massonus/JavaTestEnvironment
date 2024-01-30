package com.test.TestOnlineSchoolMVC.repo;

import com.test.TestOnlineSchoolMVC.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepo extends JpaRepository<Lecture, Long> {
}
