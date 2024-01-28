package org.test.TestOnlineSchoolJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolJPA.entity.Lecture;

public interface LectureRepo extends JpaRepository<Lecture, Long> {
}
