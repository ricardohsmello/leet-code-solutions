package br.com.ricas.exercises;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
* */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;

        Map<Integer, Character> hashMap = new HashMap<>();
        int maxLength = 1;
        int aux = 0;

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(i, s.charAt(i));
        }

        maxLength = getMaxLength(hashMap, maxLength, aux);

        return maxLength;

    }

    private static int getMaxLength(Map<Integer, Character> hashMap, int maxLength, int aux) {
        List<Character> values;
        for (int i = 0; i < hashMap.size(); i++) {
           maxLength = Math.max(maxLength, aux);
           aux = 1;
           values = new ArrayList<>();
            for (int j = i+1; j < hashMap.size(); j++) {

                if (hashMap.get(i) == hashMap.get(j)) {
                    break;
                }

                if (values.contains(hashMap.get(j))) {
                    break;
                }

                values.add(hashMap.get(j));

                aux++;
            }
        }
        return maxLength;
    }


}
