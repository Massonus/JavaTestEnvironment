package org.test.pLesson27.p1;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();

        Instant instant = now.with(ChronoField.NANO_OF_SECOND, 10);
        Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);
        Instant sixSecTwoNanBeforeEpoch = Instant.ofEpochSecond(-6, -2);
        Instant fiftyMilliSecondsAfterEpoch = Instant.ofEpochMilli(50);

        System.out.println("now: " + now);
        System.out.println("instant: " + instant);
        System.out.println("fiveSecondsAfterEpoch: " + fiveSecondsAfterEpoch);
        System.out.println("sixSecTwoNanBeforeEpoch: " + sixSecTwoNanBeforeEpoch);
        System.out.println("fiftyMilliSecondsAfterEpoch: " + fiftyMilliSecondsAfterEpoch);
    }
}
