package exam_generation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum Operator {
    PLUS("+","exam_generation.Sum"),
    MINUS("-","exam_generation.Substraction"),
    MULTIPLY("*", "exam_generation.Multiplication"),
    DIVIDE("/","exam_generation.Division");

    private final String sign;
    private final String operation;
    private static final List<Operator> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Operator randomOperator()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
