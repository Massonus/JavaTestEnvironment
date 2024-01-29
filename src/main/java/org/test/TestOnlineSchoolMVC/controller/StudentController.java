package org.test.TestOnlineSchoolMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.test.TestOnlineSchoolMVC.entity.Student;
import org.test.TestOnlineSchoolMVC.service.Menu;
import org.test.TestOnlineSchoolMVC.service.StudentService;

@Controller
public class StudentController {


    /*с котроллером работает только Service, не Repo*/
    private final StudentService studentService;

    private final Menu menu;

    @Autowired
    public StudentController(StudentService studentService, Menu menu) {
        this.studentService = studentService;
        this.menu = menu;
    }

    @RequestMapping("/mvc")
    @ResponseBody
    public String mvc() {
        return "Hello in a Spring MVC";
    }

    @GetMapping("/")
    public String start(Model model) {
        model.addAttribute("message", "Hello, World!");
        model.addAttribute("menu", menu.getMenuItems());
        return "hello";
    }

    @GetMapping("/student/{id}")
    public String getStudent(Model model, @PathVariable int id) {
        //bad code
        final Student student = studentService
                .findAll()
                .stream().filter(s -> s.getId() == id)
                .findFirst().orElse(null);
        model.addAttribute("student", student);
        model.addAttribute("menu", menu.getMenuItems());
        return "student";
    }

    @GetMapping("/form")
    public String showStudentForm(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        return "jadder";
    }

    @GetMapping("/all-students")
    public String home(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        model.addAttribute("students", studentService.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@RequestParam String name,
                             @RequestParam String email,
                             @RequestParam String type) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setType(type);
        studentService.save(student);
        return "redirect:/all-students";
    }

}
