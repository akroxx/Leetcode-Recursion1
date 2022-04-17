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
    public TreeNode searchBST(TreeNode root, int val) {
        
        // If tree doesn't exist at that node or value found at the node
        if(root == null || root.val == val) return root;

        // If value found at root is bigger than required, search left side of BST
        if (val < root.val) return searchBST(root.left, val);
        // Or else, search RHS of BST
        else return searchBST(root.right, val);

        // Ternary statement for LOC 23 & 25
        // return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}