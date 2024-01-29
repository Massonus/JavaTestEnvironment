package org.test.TestOnlineSchoolMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.TestOnlineSchoolMVC.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {


}
