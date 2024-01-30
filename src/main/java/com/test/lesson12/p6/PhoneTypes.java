package com.test.lesson12.p6;

public enum PhoneTypes {

    MOBILE(765),
    SMART_PHONE(876),
    ANDROID(431);

    private int codes;

    public int getCodes() {
        return codes;
    }

    PhoneTypes(int codes) {
        this.codes = codes;
    }

    PhoneTypes() {
    }
}
