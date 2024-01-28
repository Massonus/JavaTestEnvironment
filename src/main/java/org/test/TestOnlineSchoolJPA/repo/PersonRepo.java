package org.test.TestOnlineSchoolJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolJPA.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
