/* 3090. Maximum Length Substring With Two Occurrences

Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.

Example 1:
Input: s = "bcbbbcba"
Output: 4
Explanation:
The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".

Example 2:
Input: s = "aaaa"
Output: 2
Explanation:
The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".

Constraints:
2 <= s.length <= 100
s consists only of lowercase English letters.

https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/?envType=daily-question&envId=2026-08-14

 */

class Solution {

    public int maximumLengthSubstring(String s) {
        int[] frq = new int[26];

        int length = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            frq[s.charAt(right) - 'a']++;

            while (frq[s.charAt(right) - 'a'] > 2) {
                frq[s.charAt(left) - 'a']--;
                left++;
            }

            length = Math.max(length, right - left + 1);
        }

        return length;
    }
}
