package org.test.pLesson59.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.pLesson59.entity.MicroPhone;
import org.test.pLesson59.entity.Phone;
import org.test.pLesson59.entity.PhoneType;
import org.test.pLesson59.repo.MicroPhoneRepo;
import org.test.pLesson59.repo.Repo;

import java.util.Random;

@Service
public class MicroPhoneService {

    private final Repo repo;

    @Autowired
    public MicroPhoneService(final MicroPhoneRepo repo) {
        this.repo = repo;
    }

    public void createMicroPhonesBeforeStart() {
        final Random random = new Random();
        final int count = random.nextInt(10, 20);

        for (int i = 0; i < count; i++) {
            final MicroPhone microPhone = new MicroPhone();
            microPhone.setName("microPhone %d".formatted(i));
            microPhone.setNumberOFPart(random.nextLong());

            if (i % 2 == 0) {
                microPhone.setPhoneType(PhoneType.BIG);
            } else {
                microPhone.setPhoneType(PhoneType.LITTLE);
            }
            repo.save(microPhone);
        }
    }

    public Phone getById(final Long id) {
        return repo.getById(id);
    }

    public boolean update(final Phone phone) {
        return repo.update(phone);
    }

    public boolean delete(final Phone phone) {
        return repo.delete(phone);
    }

}
