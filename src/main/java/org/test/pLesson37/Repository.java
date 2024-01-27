package org.test.pLesson37;

import java.util.List;

public interface Repository {
    User getUserByUsername(String username) throws Exception;

    List<User> findAllUsers();

}
