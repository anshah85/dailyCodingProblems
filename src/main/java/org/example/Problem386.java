package org.example;

public class Problem386 {
//    Given a string, sort it in decreasing order based on the frequency of characters.
//    If there are multiple possible solutions, return any of them.
//
//For example, given the string tweet, return tteew. eettw would also be acceptable.
    public static void main(String[] args) {
        String s = "tweet";
        System.out.println(sortStringDesc(s));
    }

    public static String sortStringDesc(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
