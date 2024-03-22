package exercises;

import br.com.ricas.exercises.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void test() {

      var longest = new LongestCommonPrefix();
//        String[] str = {"cafeina", "cafetina", "cafe"};
//        String[] str = ;


        assertEquals(longest.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
        assertEquals(longest.longestCommonPrefix(new String[]{"macarrao","macarlo","macarras"}), "macar");
        assertEquals(longest.longestCommonPrefix(new String[]{""}), "");
        assertEquals(longest.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}), "");

        assertEquals(longest.longestCommonPrefix(new String[]{"dog","da","digias"}), "d");
        assertEquals(longest.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");

    }
}
