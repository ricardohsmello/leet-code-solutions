package br.com.ricas.exercises;

// "flower",
// "flow",
// "flight
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

       var minValue = 200;
        for (String str : strs) {
            if (minValue > str.length()) {
                minValue = str.length();
            }
        }

        char[] c = new char[5];

        String base = strs[0];

        first:
        for (int j = 0; j < minValue; j++) {
            for (int i = 1; i <= strs.length -1; i++) {
                if (base.charAt(j) != strs[i].charAt(j)) {
                    break first;
                }
            }
            c[j] = base.charAt(j);
        }

        StringBuilder str = new StringBuilder();

        for (char c1 : c) {
            if (c1 != 0)
                str.append(c1);
        }


        return str.toString();

    }
}
