package com.test.pLesson57;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class ContactPerson {

    private String firstName;

    private String lastName;

    private String phone;

}
