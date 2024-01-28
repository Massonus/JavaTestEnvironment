package org.test.TestTask57.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.TestTask57.entity.Homework;
import org.test.TestTask57.repo.HomeworkRepo;

import java.util.Random;
import java.util.Scanner;

@Service
public class HomeworkService {

    private final HomeworkRepo homeworkRepo;

    @Autowired
    public HomeworkService(HomeworkRepo homeworkRepo) {
        this.homeworkRepo = homeworkRepo;
    }

    Homework homework;

    public Homework createElementByUser() {
        homework = new Homework();
        long size = homeworkRepo.findAll().size();
        homework.setId(size + 1);

        System.out.println("Enter task of homework");
        Scanner scanner2 = new Scanner(System.in);
        String task = scanner2.nextLine();
        homework.setTask(task);

        return homework;
    }

    Homework createElementAuto() {
        homework = new Homework();
        Random random = new Random();
        long id = random.nextInt(1, 50);

        if (id < 10 || id > 40) {
            homework.setTask("Doing first and second");
        } else if (id < 20 || id > 30) {
            homework.setTask("Doing last");
        } else {
            homework.setTask("No homework!!!");
        }
        return homework;
    }

    public void saveHomework(final Homework homework) {
        homeworkRepo.save(homework);
    }

    /*public List<Homework> sortHomeworkByLectureId(List<Homework> homeworks) {
        return homeworks.stream()
                .sorted(Comparator.comparing(Homework::getLectureId))
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Homework>> groupHomeworksByLectureId(List<Homework> homeworks) {
        return homeworks.stream()
                .collect(Collectors.groupingBy(Homework::getLectureId));
    }*/
}
