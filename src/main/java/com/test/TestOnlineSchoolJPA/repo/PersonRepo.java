package com.test.TestOnlineSchoolJPA.repo;

import com.test.TestOnlineSchoolJPA.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
