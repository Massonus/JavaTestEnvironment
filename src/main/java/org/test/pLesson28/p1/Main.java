package org.test.pLesson28.p1;

import org.test.pLesson28.Phone;
import org.test.pLesson28.User;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        User user = new User(1, "John");

        User user3 = new User(1, null);

        Phone phone = new Phone(1, "Samsung", user3);


        Phone phone1 = new Phone(2, "Samsung", null);

        Phone phone2 = new Phone(3, "Samsung1", user3);

        final String name = phone.getUser().getName();

        System.out.println(name);


        if (phone1.getUser() != null) {
            System.out.println(phone1.getUser().getName());
        }


        final Optional<User> user1 = Optional.ofNullable(phone1.getUser());

  /*      if (user1.isPresent()) {
            System.out.println(user1.get().getName());
        }*/

        final int s = Optional.ofNullable(phone2.getUser())
                .map(u -> u.getName())
                .map(f -> f.length())
                .orElse(0);

        System.out.println(s);


        User user4 = null;

        final User user2 = Optional.ofNullable(user4).orElseGet(() -> new User(4, "5"));

        final User user5 = Optional.ofNullable(user4).orElse(user2);

        System.out.println(user2);
        System.out.println(user5);

        Optional.ofNullable(user4)
                .map(u -> u.getName())
                .orElseGet(() -> new String("hdhhdshd"));

        Phone phone3 = Optional.of(phone).filter(p -> p.getId() == 3).orElse(null);

        System.out.println(phone3);

    }

}
