package org.test.TestOnlineSchoolMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.test.TestOnlineSchoolMVC.entity.AdditionalMaterial;
import org.test.TestOnlineSchoolMVC.entity.ResourceType;
import org.test.TestOnlineSchoolMVC.service.AdditionalMaterialService;
import org.test.TestOnlineSchoolMVC.service.Menu;

@Controller
public class AdditionalMaterialController {

    /*с котроллером работает только Service, не Repo*/
    private final AdditionalMaterialService materialService;
    private final Menu menu;

    @Autowired
    public AdditionalMaterialController(AdditionalMaterialService materialService, Menu menu) {
        this.materialService = materialService;
        this.menu = menu;
    }

    @GetMapping("/material/{id}")
    public String getMaterial(Model model, @PathVariable long id) {
        final AdditionalMaterial material = materialService.getMaterialById(id).orElse(null);
        model.addAttribute("material", material);
        model.addAttribute("menu", menu.getMenuItems());
        return "info/material_info";
    }

    @GetMapping("/all-materials")
    public String home(Model model) {
        model.addAttribute("menu", menu.getMenuItems());
        model.addAttribute("materials", materialService.getMaterialList());
        return "menu/material_menu";
    }

    @PostMapping("/addMaterial")
    public String addMaterial(@RequestParam String task,
                              @RequestParam String type,
                              @RequestParam Long lectureId) {
        ResourceType resourceType = ResourceType.valueOf(type);
        final AdditionalMaterial newMaterial = materialService.createElementByUser(task, resourceType, lectureId);
        materialService.saveMaterial(newMaterial);
        return "redirect:/all-materials";
    }

}
