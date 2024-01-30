package com.test.pLesson59.repo;

import com.test.pLesson59.entity.Phone;

public interface Repo {

    boolean save(Phone phone);

    Phone getById(Long id);

    boolean update(Phone phone);

    boolean delete(Phone phone);

}
