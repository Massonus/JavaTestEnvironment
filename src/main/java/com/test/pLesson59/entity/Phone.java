package com.test.pLesson59.entity;

public interface Phone {

    Long getId();

    String getName();

    PhoneType getPhoneType();

    void setPhoneType(PhoneType phoneType);

    void setName(String name);
}
