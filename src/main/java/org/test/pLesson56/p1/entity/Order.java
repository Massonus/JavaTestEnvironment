package org.test.pLesson56.p1.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "pizza")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String description;

    @Embedded
    private ContactPerson contactPerson;

    public Order() {
    }
}
