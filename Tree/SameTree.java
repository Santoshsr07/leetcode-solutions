// 100. Same Tree
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

// Example 1:
// Input: p = [1,2,3], q = [1,2,3]
// Output: true

// Example 2:
// Input: p = [1,2], q = [1,null,2]
// Output: false

// Example 3:
// Input: p = [1,2,1], q = [1,1,2]
// Output: false

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ptree = new ArrayList<>();
        List<Integer> qtree = new ArrayList<>();
        helper(p, ptree);
        helper(q, qtree);
        return ptree.equals(qtree);
    }

    public void helper(TreeNode n, List<Integer> list) {
        if (n == null) {
            list.add(null);
            return;
        }
        list.add(n.val);
        helper(n.left, list);
        helper(n.right, list);
    }
}