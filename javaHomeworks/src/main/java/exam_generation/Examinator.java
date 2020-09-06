package exam_generation;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    public List<Exercise> generate(int amount) {
        List<Exercise> exs = null;
        Exercise ex ;
        for (int i=0; i < amount; i++){
            ex = new Exercise();
            ex.print();
            exs.add(ex);
        }

        return exs;//todo finish this
    }

    public static void main(String[] args) {
        Examinator exam = new Examinator();
        exam.generate(10);
    }
}
