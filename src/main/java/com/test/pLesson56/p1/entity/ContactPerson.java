package com.test.pLesson56.p1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@Setter
@Getter
@ToString
public class ContactPerson {

    private String username;

    private String email;

    private String phoneNumber;

}
