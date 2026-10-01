/* 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

https://leetcode.com/problems/valid-parentheses/description/?envType=daily-question&envId=2026-10-01 */

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else if (!stk.isEmpty() &&
                    ((stk.peek() == '(' && ch == ')') || (stk.peek() == '[' && ch == ']') || (stk.peek() == '{' && ch == '}'))) {
                stk.pop();
            } else {
                return false;
            }
        }

        return stk.isEmpty();
    }
}