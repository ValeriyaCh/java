package exam_generation;

import lombok.Getter;

@Getter
public class Multiplication implements Operation {
    private final double a;
    private final double b;
    private final double MAX_VALUE = 100;
    private final double MIN_VALUE = 0;

    public Multiplication() {
        this.a = NumGenerator.getDoubleBetween(MIN_VALUE,MAX_VALUE);
        this.b = NumGenerator.getDoubleBetween(MIN_VALUE,MAX_VALUE);
    }

    @Override
    public double getAnswer() {
        return a*b;
    }

}
