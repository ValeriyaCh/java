package com.learn_english.bot.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtil {

    private static final Random random = new Random();

    public static int getIntBetween(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static <T> T randomItem(List<T> list) {
        int randomInt = getIntBetween(0, list.size());
        return list.get(randomInt);
    }

}
