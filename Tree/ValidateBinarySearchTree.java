// 98. Validate Binary Search Tree

// Given the root of a binary tree, determine if it is a valid binary search tree (BST).

// A valid BST is defined as follows:

// The left subtree of a node contains only nodes with keys strictly less than the node's key.
// The right subtree of a node contains only nodes with keys strictly greater than the node's key.
// Both the left and right subtrees must also be binary search trees.


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
    List<Integer> result = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        helper(root);

        long pre = Long.MIN_VALUE;
        for(int nums : result){
            if(pre >= nums) return false;
            pre = nums;
        }

        return true;
    }
    public void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);
        result.add(root.val);
        helper(root.right);
    }
}