package exam_generation;

import lombok.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
public class Exercise {
    private double a;
    private double b;
    private double answer;
    private Operator operator;


    @SneakyThrows
    public Exercise() {
        this.operator = Operator.randomOperator();
        Class<? extends Operation> op = (Class<? extends Operation>) Class.forName(operator.getOperation());
        Operation newEx = op.getConstructor().newInstance();
        this.answer = newEx.getAnswer();
        this.a = newEx.getA();
        this.b = newEx.getB();
    }

    public void print(){
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(a) + operator.getSign() + formatter.format(b) + "=" + formatter.format(answer));
    }

    public static void main(String[] args) {
        Exercise ex = new Exercise();
        Random random = new Random(5);
        ex.print();
    }

}
