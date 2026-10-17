/* 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

https://leetcode.com/problems/longest-common-prefix/ */

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}

/* Another approach is to compare the characters of the first string with all other strings in the array. */

class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";
        int i = 0;

        while (i < strs[0].length()) {
            char ch = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() <= i ||
                        strs[j].charAt(i) != ch) {
                    return lcp;
                }
            }

            i++;
            lcp += ch;
        }

        return lcp;
    }
}