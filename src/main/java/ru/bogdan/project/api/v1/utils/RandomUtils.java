package ru.bogdan.project.api.v1.utils;

import java.util.Random;

public final class RandomUtils {
    public static int getRandomInRange(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
