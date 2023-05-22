package br.com.ricas.exercises;
/*Given an integer x, return true if x is a
palindrome
, and false otherwise.
Example 1:
Input: x = 121
10
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.*/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        if (s.length() == 1)
            return true;

        int middle = s.length() / 2;

        String firstPart = s.substring(0, middle);
        String secondPart = new StringBuilder(s.substring(middle)).reverse().toString();

        if (firstPart.length() > secondPart.length())
            secondPart = new StringBuilder(s.substring(middle-1)).reverse().toString();

        if (secondPart.length() > firstPart.length()) {
            secondPart = new StringBuilder(s.substring(middle+1)).reverse().toString();
        }

        return firstPart.contentEquals(secondPart);

    }
}
