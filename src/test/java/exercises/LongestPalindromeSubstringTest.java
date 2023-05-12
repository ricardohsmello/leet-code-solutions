package exercises;

import br.com.ricas.exercises.LongestPalindromeSubstring;
import br.com.ricas.exercises.LongestSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeSubstringTest {

    @Test
    public void test() {
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        String x = "cbbd";
        String s = longestPalindromeSubstring.longestPalindrome(x);

        assertEquals(s, "bb");
    }
}
