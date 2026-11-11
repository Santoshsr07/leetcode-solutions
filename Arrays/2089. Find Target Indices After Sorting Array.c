// 2089. Find Target Indices After Sorting Array

// You are given a 0-indexed integer array nums and a target element target.
// A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

// Example 1:
// Input: nums = [1,2,5,2,3], target = 2
// Output: [1,2]
// Explanation: After sorting, nums is [1,2,2,3,5].
// The indices where nums[i] == 2 are 1 and 2.

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *targetIndices(int *nums, int numsSize, int target, int *returnSize)
{

    for (int i = 0; i < numsSize; i++)
    {
        for (int j = 0; j < numsSize - i - 1; j++)
        {
            if (nums[j] > nums[j + 1])
            {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }

    *returnSize = 0;
    int *result = (int *)malloc(numsSize * sizeof(int));
    for (int i = 0; i < numsSize; i++)
    {
        if (nums[i] == target)
        {
            result[(*returnSize)++] = i;
        }
    }
    return result;
}