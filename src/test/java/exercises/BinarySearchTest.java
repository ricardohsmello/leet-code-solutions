package exercises;

import br.com.ricas.exercises.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void shouldTestBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        assertEquals(binarySearch.search(nums, target), 4);
    }

    @Test
    public void shouldTestBinarySearch02() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 0;

        assertEquals(binarySearch.search(nums, target), 1);
    }

    @Test
    public void shouldTestBinarySearch03() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 13;

        assertEquals(binarySearch.search(nums, target), -1);
    }
}
