package org.test.pLesson61;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.pLesson61.entity.Mouse;
import org.test.pLesson61.service.MouseService;

import java.util.List;

public class App {

    public static void main(String[] args) {

        final ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
        MouseService mouseService = ctx.getBean(MouseService.class);
        mouseService.createMousesBeforeStart();

        final List<Mouse> all = mouseService.findAll();
        all.forEach(System.out::println);

        final Long id = 4L;

        final Mouse mouse = mouseService.getMouse(id).orElse(null);
        System.out.printf("my mouse by id %d %s%n", id, mouse);

        final Mouse mouse1 = mouseService.getMouse(999L).orElse(null);
        System.out.printf("my mouse by id with out value %s".formatted(mouse1));

        mouse.setAge(9999);
        mouse.setValue(8888.0);

        /*mouseService.updateMouse(mouse);*/

        mouseService.saveMouse(mouse);


    }

}
