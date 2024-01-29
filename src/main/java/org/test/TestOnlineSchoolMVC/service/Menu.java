package org.test.TestOnlineSchoolMVC.service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.test.TestOnlineSchoolMVC.entity.MenuItem;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class Menu {

   private final List<MenuItem> menuItems = new ArrayList<>();

    {
        menuItems.add(new MenuItem("/Test_war_exploded/", "Main"));
        menuItems.add(new MenuItem("/Test_war_exploded/all-materials", "All materials"));
        menuItems.add(new MenuItem("/Test_war_exploded/all-homework", "All homework"));
        menuItems.add(new MenuItem("/Test_war_exploded/all-people", "All people"));
    }

}
