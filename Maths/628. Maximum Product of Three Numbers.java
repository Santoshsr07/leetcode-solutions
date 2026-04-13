// 628. Maximum Product of Three Numbers

// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: 6
// Example 2:

// Input: nums = [1,2,3,4]
// Output: 24
// Example 3:

// Input: nums = [-1,-2,-3]
// Output: -6
 

// Constraints:

// 3 <= nums.length <= 104
// -1000 <= nums[i] <= 1000

class Solution {
    public int maximumProduct(int[] nums) {


        Arrays.sort(nums);
        int n = nums.length;

        int a =nums[n - 1] * nums[n - 2] * nums[n - 3];
        int b =nums[0] * nums[1] * nums[n - 1];
        return Math.max(a,b);

        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // for(int num : nums){
        //     maxHeap.add(num);
        // }

        // int a = maxHeap.poll();
        // int b = maxHeap.poll();
        // int c = maxHeap.poll();

        // return a * b * c;


    }
}