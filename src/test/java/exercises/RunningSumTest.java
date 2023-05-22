package exercises;

import br.com.ricas.exercises.RunningSum;
import org.junit.jupiter.api.Test;
public class RunningSumTest {
    @Test
    public void runningSum() {
        int [] numbers = {3,1,2,10,1};
        RunningSum r = new RunningSum();
        r.runningSum(numbers);
    }
}
