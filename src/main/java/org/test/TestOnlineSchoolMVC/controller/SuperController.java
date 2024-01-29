package org.test.TestOnlineSchoolMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.test.TestOnlineSchoolMVC.entity.Student;
import org.test.TestOnlineSchoolMVC.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class SuperController {

    private final StudentService studentService;

    @Autowired
    public SuperController(final StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping(path = "", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Student>> getCategories() {
        List<Student> studentServiceAll = studentService.findAll();
        return new ResponseEntity<>(studentServiceAll, HttpStatus.OK);
    }

    @PostMapping(path = "", produces = "application/json")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}
