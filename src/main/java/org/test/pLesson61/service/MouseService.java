package org.test.pLesson61.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.pLesson61.entity.Mouse;
import org.test.pLesson61.entity.MouseType;
import org.test.pLesson61.repo.MouseRepo;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class MouseService {

    private final MouseRepo mouseRepo;

    @Autowired
    public MouseService(final MouseRepo mouseRepo) {
        this.mouseRepo = mouseRepo;
    }

    public void saveMouse(final Mouse mouse) {
        mouseRepo.save(mouse);
    }

    public List<Mouse> findAll() {
        return mouseRepo.findAll();
    }

    public Optional<Mouse> getMouse(final Long id) {
        return mouseRepo.findById(id);
    }

    public List<Mouse> getMouseList() {
        return mouseRepo.findAllByAge(10);
    }

    public void updateMouse(final Mouse mouse) {
        mouseRepo.updateMouse(mouse);
    }

    public void createMousesBeforeStart() {
        final Random random = new Random();
        final int count = random.nextInt(10, 20);

        for (int i = 0; i < count; i++) {
            final Mouse mouse = new Mouse();
            mouse.setAge(random.nextInt(1, 10));
            mouse.setValue(random.nextDouble());
            mouse.setName(random.nextInt() + " mouse");

            if (i % 2 == 0) {
                mouse.setMouseType(MouseType.RED);
            } else {
                mouse.setMouseType(MouseType.GREEN);
            }
            mouseRepo.save(mouse);
        }
    }


}
