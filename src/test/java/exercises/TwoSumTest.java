package exercises;

import br.com.ricas.exercises.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {


    @Test
    public void givenTarget9ShouldReturnPosition0And1() {
        int[] expected = {0, 1};
        int[] numbers = {2,7,11,15};

        TwoSum two = new TwoSum();

        int target = 9;

        assertEquals(two.oC(numbers, target)[0], expected[0]);
        assertEquals(two.oC(numbers, target)[1], expected[1]);

    }

    @Test
    public void givenTarget6ShouldReturnPosition1And2() {
        int[] expected = {1, 2};
        int[] numbers = {3, 2, 4};
        TwoSum two = new TwoSum();
        int target = 6;
        assertEquals(two.oC(numbers, target)[0], expected[0]);
        assertEquals(two.oC(numbers, target)[1], expected[1]);
    }


    @Test
    public void givenTarget3ShouldReturnPosition0And1() {
        int[] expected = {1, 2};
        int[] numbers = {3,3};
        TwoSum two = new TwoSum();

        int target = 6;

        assertEquals(two.oC(numbers, target)[0], expected[0]);
        assertEquals(two.oC(numbers, target)[1], expected[1]);
    }

    @Test
    public void anotherTest() {
        int[] expected = {1, 2};
        int[] numbers = {3,2,3};

        TwoSum two = new TwoSum();

        int target = 6;

        assertEquals(two.oC(numbers, target)[0], expected[0]);
        assertEquals(two.oC(numbers, target)[1], expected[1]);
    }

    @Test
    public void anotherTest01() {
        int[] expected = {1, 2};
        int[] numbers = {2,5,5,11};

        TwoSum two = new TwoSum();

        int target = 10;

        assertEquals(two.oC(numbers, target)[0], expected[0]);
        assertEquals(two.oC(numbers, target)[1], expected[1]);
    }



}
