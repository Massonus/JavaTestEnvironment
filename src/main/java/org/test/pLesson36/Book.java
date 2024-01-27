package org.test.pLesson36;

import lombok.Data;

@Data
public class Book {

    private String id;

    private long count;

    private boolean isAvailable;

    public Book(String id, long count, boolean isAvailable) {
        this.id = id;
        this.count = count;
        this.isAvailable = isAvailable;
    }
}
