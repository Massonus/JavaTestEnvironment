package com.test.pLesson36;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookUtils {

    public Book getBook(final String id, final long count) {
        return new Book(id, count, true);
    }

    public boolean isMyBook(final Book book) {
        if (Objects.isNull(book)) {
            throw new IllegalArgumentException();
        }

        return book.isAvailable() && book.getCount() > 0;
    }

    public List<Book> getBookList(final int size) {

        final List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            boolean isBook = i % 2 == 0;

            Book book = new Book("id" + i, i, isBook);

            bookList.add(book);
        }

        return bookList;
    }


}
