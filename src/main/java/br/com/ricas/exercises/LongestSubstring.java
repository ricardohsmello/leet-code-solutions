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
        int aux = 1;

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(i, s.charAt(i));
        }

        return recursive(hashMap, 0, 1, aux,maxLength, new ArrayList<>());

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

    // a, b, c, a

    //a, a, b, c
    //0, 1, 2, 3
    //a,b,c,a,b,c,d
    //0,1,2,3,4,5,6
//    p,w,w,k,e,w
    //0,1,2,3,4,5
    private int recursive(Map<Integer, Character> hashMap, int i, int j, int aux, int maxLength, List<Character> values) {

        if (i == hashMap.size() - 1) {
            return Math.max(maxLength, aux);
        }

        if (hashMap.get(i) == hashMap.get(j) || values.contains(hashMap.get(j))) {
            i++;
            return recursive(hashMap, i, i+1, 1, maxLength, new ArrayList<>());
        }

        aux++;

        values.add(hashMap.get(j));

        if (j == hashMap.size() - 1) {
            i++;
        }

        return recursive(hashMap, i, i+1, aux, maxLength, values);


    }



}
