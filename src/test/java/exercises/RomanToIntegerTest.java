package exercises;

import br.com.ricas.exercises.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void test() {
        var r = new RomanToInteger();

//        assertEquals(r.romanToInt2("IV"), 4);
//        assertEquals(r.romanToInt2("IX"), 9);
//        assertEquals(r.romanToInt2("XL"), 40);
//        assertEquals(r.romanToInt2("XC"), 90);
//        assertEquals(r.romanToInt2("CD"), 400);
//        assertEquals(r.romanToInt2("CM"), 900);
//        assertEquals(r.romanToInt2("LVIII"), 58);
//
//        assertEquals(r.romanToInt2("DCCCLXXXVIII"), 888);
//        assertEquals(r.romanToInt2("CDXLIV"), 444);
//        assertEquals(r.romanToInt2("MMCMXCIX"), 2999);
//        assertEquals(r.romanToInt2("MMXVIII"), 2018);
//        assertEquals(r.romanToInt2("MCDXCII"), 1492);
//        assertEquals(r.romanToInt2("MCCXXXIV"), 1234);



        assertEquals(r.romanToInt2("MCMXCIV"), 1994);



    }
}
