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
    public LinkedList<TreeNode> helper(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<TreeNode>();

        if (start > end){
            allTrees.add(null);
            return allTrees;
        }

        // pick up a root

        for (int i = start; i <= end; i++){
            // all possible left subtrees if i is chosen to be a root
            LinkedList<TreeNode> leftTrees = helper(start, i-1);

            // all possible righ subtrees if i is chosen to be a root
            LinkedList<TreeNode> rightTrees = helper(i+1, end);

            // connect left and right trees to the chosen root i
            for(TreeNode l : leftTrees){
                for(TreeNode r : rightTrees){
                    TreeNode current = new TreeNode(i);
                    current.left = l;
                    current.right = r;
                    allTrees.add(current);
                }
            }
        }
        return allTrees;
    }
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<TreeNode>();
        return helper(1, n);
    }
}