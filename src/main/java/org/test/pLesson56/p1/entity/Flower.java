package org.test.pLesson56.p1.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public Flower() {
    }

}
