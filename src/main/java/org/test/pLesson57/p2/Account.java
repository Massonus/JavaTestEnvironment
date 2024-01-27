package org.test.pLesson57.p2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double amount;

    @OneToOne(mappedBy = "account")
    private Profile profile;

    public Account() {
    }
}
