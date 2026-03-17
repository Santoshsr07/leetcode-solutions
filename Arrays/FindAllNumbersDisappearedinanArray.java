// 448. Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
 

// Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

// Brute fore version
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = Integer.MIN_VALUE;
        List<Integer> missing = new ArrayList<>();

        // for (int num : nums) {
        //     if (num > max)
        //         max = num;
        // }

        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing.add(i);
            }
        }
        return missing;

    }
}


// Optimized version
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = Integer.MIN_VALUE;
        List<Integer> missing = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                missing.add(i+1);
        }
        return missing;

    }
}