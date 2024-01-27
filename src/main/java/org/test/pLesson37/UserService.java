package org.test.pLesson37;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean checkUserPresence (User user) throws Exception {
        User userToFind = userRepository.getUserByUsername(user.getUsername());

        return userToFind != null;
    }
}
