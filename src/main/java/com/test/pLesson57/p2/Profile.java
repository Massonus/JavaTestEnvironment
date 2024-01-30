package com.test.pLesson57.p2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Profile() {
    }
}
