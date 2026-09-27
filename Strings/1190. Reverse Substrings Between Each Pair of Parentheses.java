/* 1190. Reverse Substrings Between Each Pair of Parentheses

You are given a string s that consists of lower case English letters and brackets.
Reverse the strings in each pair of matching parentheses, starting from the innermost one.
Your result should not contain any brackets.

Example 1:
Input: s = "(abcd)"
Output: "dcba"

Example 2:
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

Example 3:
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

Constraints:
1 <= s.length <= 2000
s only contains lower case English characters and parentheses.
It is guaranteed that all parentheses are balanced.

https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/?envType=daily-question&envId=2026-09-27 */

class Solution {

    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int count = 1;
                int j = i + 1;

                while (count > 0) {
                    if (s.charAt(j) == '(') {
                        count++; 
                    }else if (s.charAt(j) == ')') {
                        count--;
                    }
                    j++;
                }
                j--;

                String inside = s.substring(i + 1, j);
                str.append(rev(reverseParentheses(inside)));
                i = j;
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
