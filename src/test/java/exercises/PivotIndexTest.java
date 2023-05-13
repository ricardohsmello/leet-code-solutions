package exercises;

import br.com.ricas.exercises.PivotIndex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PivotIndexTest {

    @Test
    public void pivot() {
        int[] numbers = { 2,3,-1,8,4};

        int indexTarget = 3;
        PivotIndex pivotIndex = new PivotIndex();
        int pivot = pivotIndex.pivot(numbers);

        assertEquals(pivot, indexTarget);
    }

    @Test
    public void pivot01() {
        int[] numbers = {1,7,3,6,5,6};

        int indexTarget = 3;
        PivotIndex pivotIndex = new PivotIndex();
        int pivot = pivotIndex.pivot(numbers);

        assertEquals(pivot, indexTarget);

    }
    @Test
    public void shouldReturn_negative1() {
        int[] numbers = {1,2,3};

        int indexTarget = -1;
        PivotIndex pivotIndex = new PivotIndex();
        int pivot = pivotIndex.pivot(numbers);

        assertEquals(pivot, indexTarget);
    }

    @Test
    public void shouldReturn_zero() {
        int[] numbers = {2,1,-1};

        int indexTarget = 0;
        PivotIndex pivotIndex = new PivotIndex();
        int pivot = pivotIndex.pivot(numbers);

        assertEquals(pivot, indexTarget);
    }
}
