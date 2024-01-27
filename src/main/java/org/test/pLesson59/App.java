package org.test.pLesson59;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.pLesson59.entity.Phone;
import org.test.pLesson59.entity.PhoneType;
import org.test.pLesson59.service.MicroPhoneService;

public class App {

    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfig.class);
        MicroPhoneService microPhoneService = ctx.getBean(MicroPhoneService.class);

        microPhoneService.createMicroPhonesBeforeStart();
        final Phone byId = microPhoneService.getById(1L);
        final Long id = byId.getId();
        System.out.printf("this is my id%d%n", id);
        System.out.printf("this is my old phone %s%n", byId);
        byId.setName("MyFirstName");
        byId.setPhoneType(PhoneType.LITTLE);

        microPhoneService.update(byId);

        final Phone updatedPhone = microPhoneService.getById(byId.getId());

        System.out.printf("my new phone is %s%n", updatedPhone);

        final boolean delete = microPhoneService.delete(updatedPhone);

        System.out.printf("i delete %s%n", delete);

    }

}
