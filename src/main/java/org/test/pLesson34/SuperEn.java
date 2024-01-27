package org.test.pLesson34;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class SuperEn {

    private String id;

    private int count;

    private String name;

    private Date timestamp;

    private Object parent;

    private List<String> superList = new ArrayList<>();

    public String getName() {
        return "true";
    }
}
