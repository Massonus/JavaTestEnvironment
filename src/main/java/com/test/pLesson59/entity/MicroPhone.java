package com.test.pLesson59.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class MicroPhone implements Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;

    @Column(name = "number_of_part")
    private Long numberOFPart;

    public MicroPhone() {
    }
}
