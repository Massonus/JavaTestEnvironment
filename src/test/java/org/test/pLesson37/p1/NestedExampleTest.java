package org.test.pLesson37.p1;


import org.junit.jupiter.api.*;

@DisplayName("Nested Example")
public class NestedExampleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @Nested
    @DisplayName("Nested class A")
    class A {

        @BeforeEach
        void beforeEach() {
            System.out.println("BeforeEach Nested class A");
        }

        @AfterEach
        void afterEach() {
            System.out.println("AfterEach Nested class A");
        }

        @Test
        @DisplayName("Class A test1")
        void test1() {
            System.out.println("test1");
        }
        @Test
        @DisplayName("Class A test2")
        void test2() {
            System.out.println("test2");
        }
    }

}
