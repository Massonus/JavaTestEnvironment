package org.test.pLesson36;

import com.test.pLesson36.Book;
import com.test.pLesson36.BookUtils;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookUtilsTest {

    private BookUtils target;

    private List<Book> bookList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        target = new BookUtils();
        System.out.println("my name is beforeEach");
    }

    @BeforeAll
    static void setAll() {
        System.out.println("my name is BeforeAll");
    }

    @AfterAll
    static void setAllAfter() {
        System.out.println("my name is AfterAll");
    }

    @AfterEach
    void afterResult() {
        System.out.println("my name is AfterEach");
    }

    @Test
    void getBook() {
        final String id = "myBook";

        final long count = 10;

        final Book result = target.getBook(id, count);

        assertThat(result.getCount())
                .isEqualTo(count);
        assertThat(result.getId())
                .isEqualTo(id);
        assertThat(result.isAvailable())
                .isTrue();
    }

    @Test
    void getBookWithBook() {
        final String id = "myBook";

        final long count = 10;

        final Book expected = new Book(id, count, true);

        final Book result = target.getBook(id, count);

        assertThat(result)
                .isEqualTo(expected);
    }

    @Test
    void isMyBook() {
        final Book book = new Book("book", 10, true);

        final boolean result = target.isMyBook(book);

        assertThat(result)
                .isTrue();
    }

    @Test
    void isMyBookWithOutBook() {
        assertThrows(IllegalArgumentException.class, () -> target.isMyBook(null));
    }

    @Test
    void isMyBookFalse() {
        final Book book = new Book("book", 0, true);

        final boolean result = target.isMyBook(book);

        assertThat(result)
                .isFalse();
    }

    @Test
    void isMyBookFalseWithOutIsAvailable() {
        final Book book = new Book("book", 10, false);

        final boolean result = target.isMyBook(book);

        assertThat(result)
                .isFalse();
    }

    @Test
    void isMyBookList() {
        Book book = new Book("book", 10, true);
        Book book1 = new Book("book1", 10, false);
        Book book2 = new Book("book2", 10, false);

        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);

        final List<Book> bookList1 = target.getBookList(3);

        assertThat(bookList1)
                .hasSize(bookList.size());
    }

    @Test
    void isMyBookListTwo() {
        Book book = new Book("book", 10, true);
        Book book1 = new Book("book1", 10, false);
        Book book2 = new Book("book2", 10, false);
        Book book3 = new Book("book2", 10, false);
        Book book4 = new Book("book2", 10, false);

        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        final List<Book> bookList1 = target.getBookList(5);

        assertThat(bookList1)
                .hasSize(bookList.size());
    }

    @Test
    void isMyBookListIsRec() {
        Book book = new Book("id0", 0, true);
        Book book1 = new Book("id1", 1, false);

        bookList.add(book);
        bookList.add(book1);

        final List<Book> bookList1 = target.getBookList(2);

        assertThat(bookList1)
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(bookList);
    }

}