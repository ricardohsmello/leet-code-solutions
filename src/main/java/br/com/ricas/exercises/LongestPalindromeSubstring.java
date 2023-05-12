package br.com.ricas.exercises;

import java.util.HashMap;
import java.util.Map;

/*Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer*/
public class LongestPalindromeSubstring {

    public String longestPalindrome(String s) {

        if (s.length() == 1)
            return s;


        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(i, s.charAt(i));
        }

        for (Map.Entry<Integer, Character> integerCharacterEntry : map.entrySet()) {
            System.out.println(integerCharacterEntry.getKey());
            System.out.println(integerCharacterEntry.getValue());
        }


        return "";
    }
}
