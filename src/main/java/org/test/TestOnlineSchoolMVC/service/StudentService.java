package org.test.TestOnlineSchoolMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.TestOnlineSchoolMVC.entity.Student;
import org.test.TestOnlineSchoolMVC.repo.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addUser() {
        final Student student = new Student();
        student.setName("Jon");
        student.setType("Bio");
        student.setEmail("Bio@gmail.com");

        studentRepo.saveAndFlush(student);
    }

    public void save(Student student) {
        studentRepo.saveAndFlush(student);
    }


    public List<Student> findAll() {
        return studentRepo.findAll();
    }

}
