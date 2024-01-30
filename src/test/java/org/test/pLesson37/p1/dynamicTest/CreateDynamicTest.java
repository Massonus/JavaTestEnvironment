package org.test.pLesson37.p1.dynamicTest;


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import com.test.pLesson37.Calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateDynamicTest {
    Calculator calculator = new Calculator();

    @TestFactory
    Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition test",
                        () -> assertEquals(2, calculator.addition(1, 1))),
                DynamicTest.dynamicTest("division Test",
                        () -> assertEquals(2, calculator.division(4, 2))));
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestsWithIterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest("addition test",
                        () -> assertEquals(2, calculator.addition(1, 1))),
                DynamicTest.dynamicTest("division Test",
                        () -> assertEquals(2, calculator.division(4, 2))));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsWithIterator() {
        return Arrays.asList(
                        DynamicTest.dynamicTest("Add test",
                                () -> assertEquals(2, calculator.addition(1, 1))),
                        DynamicTest.dynamicTest("Multiply Test",
                                () -> assertEquals(2, calculator.division(4, 2))))
                .iterator();
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromIntStream() {
        return IntStream.iterate(0, n -> n + 2).limit(10)
                .mapToObj(n -> DynamicTest.dynamicTest("test" + n,
                        () -> assertTrue(n % 2 == 0)));
    }


    @Test
    @Tag("IntegrationTest")
    public void test1() {
    }

    @Test
    @Tag("UnitTest")
    public void test2() {
    }


}


