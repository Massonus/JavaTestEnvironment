package com.test.TestOnlineSchoolJPA.service;

import com.test.TestOnlineSchoolJPA.entity.AdditionalMaterial;
import com.test.TestOnlineSchoolJPA.entity.ResourceType;
import com.test.TestOnlineSchoolJPA.repo.AdditionalMaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class AdditionalMaterialService {

    private final AdditionalMaterialRepo materialsRepo;

    @Autowired
    public AdditionalMaterialService(AdditionalMaterialRepo materialsRepo) {
        this.materialsRepo = materialsRepo;
    }

    AdditionalMaterial material;

    public AdditionalMaterial createElementByUser() {
        material = new AdditionalMaterial();
        long size = materialsRepo.findAll().size();
        material.setId(size + 1L);
        System.out.println("Enter name of material");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        material.setTask(name);

        System.out.println("1. To select the resourceType URL");
        System.out.println("2. To select the resourceType VIDEO");
        System.out.println("3. To select the resourceType BOOK");
        Scanner scanner2 = new Scanner(System.in);
        int resourceType = scanner2.nextInt();
        if (resourceType == 1) {
            material.setResourceType(ResourceType.URL);
        } else if (resourceType == 2) {
            material.setResourceType(ResourceType.VIDEO);
        } else if (resourceType == 3) {
            material.setResourceType(ResourceType.BOOK);
        } else {
            System.out.println("Incorrect");
        }

        return material;
    }

    public AdditionalMaterial createElementAuto() {
        material = new AdditionalMaterial();
        long id = materialsRepo.findAll().size() + 1L;

        material.setTask("Material " + id);

        if (id % 2 == 0) {
            material.setResourceType(ResourceType.URL);
        } else if (id % 3 == 2) {
            material.setResourceType(ResourceType.VIDEO);
        } else {
            material.setResourceType(ResourceType.BOOK);
        }

        return material;
    }

    public void saveMaterial(final AdditionalMaterial material) {
        materialsRepo.save(material);
    }

    public List<AdditionalMaterial> sortMaterialsById(List<AdditionalMaterial> materials) {
        return materials.stream()
                .sorted(Comparator.comparing(AdditionalMaterial::getId))
                .collect(Collectors.toList());
    }

    public List<AdditionalMaterial> sortMaterialsByType(List<AdditionalMaterial> materials) {
        return materials.stream()
                .sorted(Comparator.comparing(a -> a.getResourceType().toString()))
                .collect(Collectors.toList());
    }

    public List<AdditionalMaterial> sortMaterialsByName(List<AdditionalMaterial> materials) {
        return materials.stream()
                .sorted(Comparator.comparing(AdditionalMaterial::getTask))
                .collect(Collectors.toList());
    }

    /*public List<AdditionalMaterial> sortMaterialsByLectureId(List<AdditionalMaterial> materials) {
        return materials.stream()
                .sorted(Comparator.comparing(AdditionalMaterial::getLectureId))
                .collect(Collectors.toList());
    }*/

    /*public Map<Integer, List<AdditionalMaterial>> groupingMaterialsAsMap(List<AdditionalMaterial> materials) {
        return materials.stream()
                .collect(Collectors.groupingBy(AdditionalMaterial::getLectureId));
    }*/
}