// 387. First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"

// Output: 0

// Explanation:

// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:

// Input: s = "loveleetcode"

// Output: 2

// Example 3:

// Input: s = "aabb"

// Output: -1

// Constraints:

// 1 <= s.length <= 105
// s consists of only lowercase English letters.

// -----------------code----------------
class Solution {
    public int firstUniqChar(String s) {
        // for (int i = 0; i < s.length(); i++) {
        // boolean app = true;
        // for (int j = 0; j < s.length(); j++) {
        // if (i != j && s.charAt(i) == s.charAt(j)) {
        // app = false;
        // break;
        // }
        // }
        // if (app != false)
        // return i;
        // }
        // return s.length() <= 1 ? 0:-1;

        int[] freq = new int[26];

        // count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // find first unique
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}