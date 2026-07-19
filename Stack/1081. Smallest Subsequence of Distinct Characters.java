// 1081. Smallest Subsequence of Distinct Characters

// Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.

// Example 1:
// Input: s = "bcabc"
// Output: "abc"

// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"

// Constraints:
// 1 <= s.length <= 1000
// s consists of lowercase English letters.

//  ----- C ----- O ----- D ----- E ----- 

import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        boolean[] vis = new boolean[26];
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) freq[ch - 'a']++;
    
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;

            if (vis[ch - 'a']) continue;

            while (!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
                vis[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            vis[ch - 'a'] = true;
        }

        for (char ch : stack) res.append(ch);

        return res.toString();

    }
}