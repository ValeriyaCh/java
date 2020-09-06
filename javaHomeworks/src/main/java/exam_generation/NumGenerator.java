package exam_generation;

import java.util.Random;

public class NumGenerator {
    private static final Random random = new Random();

    public static double getDoubleBetween(double min, double max) {
        return random.nextDouble()*(max - min) + min;
    }
    public static int getIntBetween(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
