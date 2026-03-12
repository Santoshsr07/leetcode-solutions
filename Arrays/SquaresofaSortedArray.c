// 977. Squares of a Sorted Array

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *sortedSquares(int *nums, int numsSize, int *returnSize)
{
    int *result = (int *)malloc(numsSize * sizeof(int));
    *returnSize = numsSize;
    int left = 0;
    int right = numsSize - 1;
    int pos = numsSize - 1;

    while (left <= right)
    {
        int leftsq = nums[left] * nums[left];
        int rightsq = nums[right] * nums[right];
        if (leftsq > rightsq)
        {
            result[pos] = leftsq;
            left++;
        }
        else
        {
            result[pos] = rightsq;
            right--;
        }
        pos--;
    }
    return result;
}
