package org.test.pLesson37.p1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OtherAnnotationExampleTest {

    @Test
    void firstTest() {
        System.out.println("firstTest");
    }

    @DisplayName("Display name Second test")
    @Test
    void secondTest() {
        System.out.println("secondTest");
    }

    @Test
    @Disabled("thirdTest not implemented")
    void thirdTest() {
    }

}