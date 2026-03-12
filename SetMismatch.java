// Q 645. Set Mismatch

// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// Example 1:
// Input: nums = [1,2,2,4]
// Output: [2,3]

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    result[0] = nums[i];
                }
            }
        }

        int expectedSum = n * (n + 1) / 2;

        result[1] = result[0] + expectedSum - sum;

        return result;
    }
}