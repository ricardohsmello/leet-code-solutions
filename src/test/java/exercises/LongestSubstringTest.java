package exercises;

import br.com.ricas.exercises.LongestSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest {

    @Test
    public void test() {
        String s = "abcabcd";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);
        assertEquals(4, i);
    }

    @Test
    public void test01() {
        String s = "abcabcdbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);
        assertEquals(4, i);
    }

    @Test
    public void test02() {
        String s = "bbbbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(1, i);
    }

    @Test
    public void test03() {
        String s = "pwwkew";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);
        assertEquals(3, i);
    }

    @Test
    public void test4() {
        String s = "";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);
        assertEquals(0, i);
    }

    @Test
    public void test5() {
        String s = "au";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);
        assertEquals(2, i);
    }

    @Test
    public void test6() {
        String s = "dvdf";
        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(3, i);
    }

    @Test
    public void test7() {
        String s = "anviaj";

        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(5, i);
    }

    @Test
    public void test8() {
        String s = "ricardoi";

        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(6, i);
    }

    @Test
    public void test9() {
        String s = "abcdeefghij";

        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(6, i);
    }

    @Test
    public void test10() {
        String s = "ckilbkd";

        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(5, i);
    }


    @Test
    public void test11() {
        String s = "abcdef";

        LongestSubstring longestSubstring = new LongestSubstring();
        int i = longestSubstring.lengthOfLongestSubstring(s);

        assertEquals(6, i);
    }



}
