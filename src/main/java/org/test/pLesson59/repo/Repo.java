package org.test.pLesson59.repo;

import org.test.pLesson59.entity.Phone;

public interface Repo {

    boolean save(Phone phone);

    Phone getById(Long id);

    boolean update(Phone phone);

    boolean delete(Phone phone);

}
