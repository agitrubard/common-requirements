package com.agitrubard.common_requirements.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomGenerator {
    private static final Random RANDOM = new Random();

    public static Long generate(final int length) {
        final long bound = generateNumberWithSameDigits(length, 9);
        final long minBound = generateNumberWithSameDigits(length - 1, 9) + 1;
        return RANDOM.nextLong(minBound, bound);
    }

    private static Long generateNumberWithSameDigits(final int digit, final int digitCount) {

        if (digit >= 10) {
            throw new IllegalArgumentException("Digit must be less than 10!");
        }

        if (digitCount == 0) {
            return 1L;
        }

        StringBuilder stringBuilder = new StringBuilder();
        var counter = digitCount;
        while (counter > 0) {
            stringBuilder.append(digit);
            counter--;
        }
        return Long.parseLong(stringBuilder.toString());
    }


    public static String generateUUID() {
        return java.util.UUID.randomUUID().toString();
    }
}
