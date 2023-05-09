package exercises;


import br.com.ricas.exercises.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {


    //71317
    @Test
    public void isNotPalindrome01() {
        PalindromeNumber p = new PalindromeNumber();
        assertFalse(p.isPalindrome(71218));
    }

    @Test
    public void isNotPalindrome02() {
        PalindromeNumber p = new PalindromeNumber();
        assertFalse(p.isPalindrome(-121));
    }

    @Test
    public void isNotPalindrome03() {
        PalindromeNumber p = new PalindromeNumber();
        assertFalse(p.isPalindrome(10));
    }

    @Test
    public void isNotPalindrome04() {
        PalindromeNumber p = new PalindromeNumber();
        assertFalse(p.isPalindrome(23));
    }

    @Test
    public void isNotPalindrome05() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(0));
    }

    @Test
    public void isPalindrome01() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(121));
    }

    @Test
    public void isPalindrome02() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(11));
    }

    @Test
    public void isPalindrome03() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(0));
    }

    @Test
    public void isPalindrome04() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(1001));
    }

    @Test
    public void isPalindrome05() {
        PalindromeNumber p = new PalindromeNumber();
        assertTrue(p.isPalindrome(1000000001));
    }






}
