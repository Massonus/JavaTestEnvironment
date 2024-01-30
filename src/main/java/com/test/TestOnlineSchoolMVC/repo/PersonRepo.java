package com.test.TestOnlineSchoolMVC.repo;

import com.test.TestOnlineSchoolMVC.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
