package org.test.TestOnlineSchoolMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestOnlineSchoolMVC.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
