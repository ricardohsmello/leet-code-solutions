package exercises;

import br.com.ricas.exercises.CenturyOfTheYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenturyOfTheYearTest {

    @Test
    public void century() {
        CenturyOfTheYear centuryOfTheYear = new CenturyOfTheYear();
        assertEquals(centuryOfTheYear.century(1), 1);
        assertEquals(centuryOfTheYear.century(101), 2);
        assertEquals(centuryOfTheYear.century(200), 2);
        assertEquals(centuryOfTheYear.century(1905), 20);
        assertEquals(centuryOfTheYear.century(1900), 19);
        assertEquals(centuryOfTheYear.century(1700), 17);
     }
}
