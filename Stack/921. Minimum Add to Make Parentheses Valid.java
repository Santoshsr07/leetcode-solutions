/* 921. Minimum Add to Make Parentheses Valid

A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

Example 1:
Input: s = "())"
Output: 1

Example 2:
Input: s = "((("
Output: 3

Constraints:
1 <= s.length <= 1000
s[i] is either '(' or ')'.

https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/?envType=daily-question&envId=2026-10-06 */

import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!stk.isEmpty() && stk.peek() == '(' && s.charAt(i) == ')')
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        return stk.size();
    }
}