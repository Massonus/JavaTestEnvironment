package org.test.pLesson61.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.test.pLesson61.entity.Mouse;

import java.util.List;

@Repository
public interface MouseRepo extends JpaRepository<Mouse, Long> {
    List<Mouse> findAllByAge(Integer age);

    @Modifying
    @Transactional
    @Query("UPDATE Mouse m SET m.name = :#{#updatedMouse.name}, m.value = :#{#updatedMouse.value}, m.age = :#{#updatedMouse.age}, m.mouseType = :#{#updatedMouse.mouseType} WHERE m.id = :#{#updatedMouse.id}")
    void updateMouse(Mouse updatedMouse);
}
