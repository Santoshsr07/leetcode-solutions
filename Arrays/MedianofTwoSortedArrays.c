// 4. Median of Two Sorted Arrays

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

double findMedianSortedArrays(int *nums1, int nums1Size, int *nums2, int nums2Size)
{
    int totalarraysize = nums1Size + nums2Size;
    int mergedArray[totalarraysize];
    int i = 0, j = 0, k = 0;
    for (k = 0; k < totalarraysize; k++)
    {
        if (i < nums1Size && (j >= nums2Size || nums1[i] < nums2[j]))
        {
            mergedArray[k] = nums1[i];
            i++;
        }
        else
        {
            mergedArray[k] = nums2[j];
            j++;
        }
    }

    if (totalarraysize % 2 == 0)
    {
        return (mergedArray[(totalarraysize / 2) - 1] +
                mergedArray[totalarraysize / 2]) /
               2.0;
    }
    else
    {
        return mergedArray[totalarraysize / 2];
    }
    return 0;
}