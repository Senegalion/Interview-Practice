package example.java.leetcode.array_string.easy;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder merge = new StringBuilder();
        boolean is1 = true;

        while (i < word1.length() || j < word2.length()) {
            if (is1) {
                if (i < word1.length()) {
                    merge.append(word1.charAt(i));
                }
                i++;
                is1 = false;
            } else {
                if (j < word2.length()) {
                    merge.append(word2.charAt(j));
                }
                j++;
                is1 = true;
            }
        }
        return merge.toString();
    }
}
