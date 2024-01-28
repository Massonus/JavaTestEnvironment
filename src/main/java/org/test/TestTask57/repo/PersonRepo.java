package org.test.TestTask57.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.TestTask57.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
