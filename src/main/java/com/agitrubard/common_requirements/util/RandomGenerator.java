package com.agitrubard.common_requirements.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomGenerator {

    private static final Random RANDOM = new Random();

    public static Long generateNumber(final int length) {
        final long minimumValue = generateMinimumValue(length);
        final long maximumValue = generateMaximumValue(length);
        return RANDOM.nextLong(minimumValue, maximumValue);
    }

    private static Long generateMinimumValue(final int length) {
        return (long) Math.pow(10, (double) length - 1);
    }

    private static Long generateMaximumValue(final int length) {
        return (long) (Math.pow(10, length));
    }


    public static String generateUUID() {
        return java.util.UUID.randomUUID().toString();
    }
}
