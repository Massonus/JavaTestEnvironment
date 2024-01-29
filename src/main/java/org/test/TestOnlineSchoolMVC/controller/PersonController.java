package org.test.TestOnlineSchoolMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.test.TestOnlineSchoolMVC.entity.Homework;
import org.test.TestOnlineSchoolMVC.entity.Person;
import org.test.TestOnlineSchoolMVC.service.HomeworkService;
import org.test.TestOnlineSchoolMVC.service.Menu;
import org.test.TestOnlineSchoolMVC.service.PersonService;

@Controller
public class PersonController {

    private final Menu menu;
    private final PersonService personService;

    @Autowired
    public PersonController(Menu menu, PersonService personService) {
        this.menu = menu;
        this.personService = personService;
    }

    @GetMapping("/person/{id}")
    public String getStudent(Model model, @PathVariable long id) {
        final Person person = personService.getPersonById(id).orElse(null);
        model.addAttribute("person", person);
        model.addAttribute("menu", menu.getMenuItems());
        return "info/person_info";
    }

    @GetMapping("/all-people")
    public String home(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        model.addAttribute("people", personService.getPeopleList());
        return "menu/person_menu";
    }

    /*@PostMapping("/addPerson")
    public String addMaterial(@RequestParam String task,
                              @RequestParam Long lectureId) {
        final Homework newHomework = homeworkService.createElementByUser(task, lectureId);
        homeworkService.saveHomework(newHomework);
        return "redirect:/all-homework";
    }*/
}
