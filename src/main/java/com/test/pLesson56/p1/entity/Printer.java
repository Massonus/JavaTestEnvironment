package com.test.pLesson56.p1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Printer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    String name;

    @Column(name = "type")
    String type;

    @OneToOne
    @JoinColumn(name = "person_id")
    Personal personal;

    public Printer() {
    }
}
