package org.test.TestOnlineSchoolMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolMVC.entity.Lecture;

public interface LectureRepo extends JpaRepository<Lecture, Long> {
}
