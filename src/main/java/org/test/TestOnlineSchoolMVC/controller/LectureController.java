package org.test.TestOnlineSchoolMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.test.TestOnlineSchoolMVC.entity.Lecture;
import org.test.TestOnlineSchoolMVC.service.LectureService;
import org.test.TestOnlineSchoolMVC.service.Menu;

@Controller
public class LectureController {
    private final Menu menu;
    private final LectureService lectureService;

    @Autowired
    public LectureController(Menu menu, LectureService lectureService) {
        this.menu = menu;
        this.lectureService = lectureService;
    }

    @GetMapping("/lecture/{id}")
    public String getStudent(Model model, @PathVariable long id) {
        final Lecture lecture = lectureService.getLectureById(id).orElse(null);
        model.addAttribute("lecture", lecture);
        model.addAttribute("menu", menu.getMenuItems());
        return "info/lecture_info";
    }

    @GetMapping("/all-lectures")
    public String home(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        model.addAttribute("lectures", lectureService.getLectureList());
        return "menu/lecture_menu";
    }

    @PostMapping("/addLecture")
    public String addMaterial(@RequestParam String subject,
                              @RequestParam String description,
                              @RequestParam Long teacherId,
                              @RequestParam Long courseId) {

        final Lecture newLecture = lectureService.createElementByUser(subject, description, teacherId, courseId);
        lectureService.saveLecture(newLecture);
        return "redirect:/all-lectures";
    }
}