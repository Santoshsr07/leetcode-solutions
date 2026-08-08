/*

438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

Constraints:
1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.

https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i <= s.length() - p.length(); i++) {

            if (p.indexOf(s.charAt(i)) != -1) {

                int j = i;
                boolean is = false;

                int[] frq = new int[26];
                for(char ch : p.toCharArray()){
                    frq[ch - 'a']++;
                }

                while (j < i + p.length()) {
                    if (p.indexOf(s.charAt(j)) != -1 && frq[s.charAt(j) - 'a']-- >= 1) {
                        j++;
                    } else {
                        is = true;
                        break;
                    }
                }

                if (is == false) {
                    res.add(i);
                }
            }
        }
        return res;
    }
}