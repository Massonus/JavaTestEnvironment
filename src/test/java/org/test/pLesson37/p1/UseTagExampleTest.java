package org.test.pLesson37.p1;

import org.junit.jupiter.api.*;

class UseTagExampleTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach");
    }

    @Tag("DEV")
    @Test
    void test1() {
        System.out.println("test 1  @Tag(\"DEV\")");
    }

    @Tag("PROD")
    @Disabled
    @Test
    void test2() {
        System.out.println("test 2");
    }

    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll");
    }
}