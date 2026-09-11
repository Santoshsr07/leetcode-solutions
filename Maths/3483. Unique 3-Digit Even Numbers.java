/* 3483. Unique 3-Digit Even Numbers

You are given an array of digits called digits. Your task is to determine the number of distinct three-digit even numbers that can be formed using these digits.

Note: Each copy of a digit can only be used once per number, and there may not be leading zeros.

Example 1:
Input: digits = [1,2,3,4]
Output: 12

Explanation: The 12 distinct 3-digit even numbers that can be formed are 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 cannot be formed because there is only 1 copy of the digit 2.

Example 2:
Input: digits = [0,2,2]
Output: 2

Explanation: The only 3-digit even numbers that can be formed are 202 and 220. Note that the digit 2 can be used twice because it appears twice in the array.

Example 3:
Input: digits = [6,6,6]
Output: 1

Explanation: Only 666 can be formed.

Example 4:
Input: digits = [1,3,5]
Output: 0

Explanation: No even 3-digit numbers can be formed.

Constraints:
3 <= digits.length <= 10
0 <= digits[i] <= 9

https://leetcode.com/problems/unique-3-digit-even-numbers/description/?envType=daily-question&envId=2026-09-11 */

import java.util.HashSet;

class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        for (int x = 0; x < digits.length; x++) {
            if (digits[x] == 0) continue;

            for (int y = 0; y < digits.length; y++) {
                if (x == y) continue;

                for (int z = 0; z < digits.length; z++) {
                    if (y == z || x == z || digits[z] % 2 != 0) continue;
                    
                    int num = digits[x] * 100 + digits[y] * 10 + digits[z];
                    set.add(num);
                }
            }
        }

        return set.size();
    }
}