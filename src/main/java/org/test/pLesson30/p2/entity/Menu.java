package org.test.pLesson30.p2.entity;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

    public List<Dish> getDishes() {
        return dishes;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
}
