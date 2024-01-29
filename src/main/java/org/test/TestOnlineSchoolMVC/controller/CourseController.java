package org.test.TestOnlineSchoolMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.test.TestOnlineSchoolMVC.entity.Course;
import org.test.TestOnlineSchoolMVC.entity.Lecture;
import org.test.TestOnlineSchoolMVC.service.CourseService;
import org.test.TestOnlineSchoolMVC.service.LectureService;
import org.test.TestOnlineSchoolMVC.service.Menu;

import java.util.Optional;

@Controller
public class CourseController {

    private final Menu menu;
    private final CourseService courseService;

    @Autowired
    public CourseController(Menu menu, CourseService courseService) {
        this.menu = menu;
        this.courseService = courseService;
    }

    @GetMapping("/course/{id}")
    public String getStudent(Model model, @PathVariable long id) {
        final Course course = courseService.getCourseById(id).orElse(null);
        model.addAttribute("course", course);
        model.addAttribute("menu", menu.getMenuItems());
        return "info/course_info";
    }

    @GetMapping("/all-courses")
    public String home(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        model.addAttribute("courses", courseService.getCourseList());
        return "menu/course_menu";
    }
}
