package com.test.pLesson26.p3.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Developer {
    String name;
    BigDecimal salary;
    LocalDate start;

    // for factory(Developer::new);
    public Developer() {
    }

    // for factory(() -> new Developer("Java"));
    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", start=" + start +
                '}';
    }

    public static Developer factory(Supplier<? extends Developer> s) {
        Developer developer = s.get();
        if (developer.getName() == null || developer.getName().equals("")) {
            developer.setName("defaultName");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.now());

        return developer;
    }

    public static void main(String[] args) {
        Developer obj = factory(Developer::new);
        System.out.println(obj);

        Developer obj2 = factory(() -> new Developer("Java"));
        System.out.println(obj2);
    }
}


