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
  
    public int maxDepth(TreeNode root) {

      // If this tree is empty, there is no depth. This is our base case.
        if (root == null) {
            return 0;
        }
      // Return 1 (the depth of the current tree alone), plus the larger depth of the left and right nodes.
      // Call this recursively to break the tree down to smallest problems.
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
    }
  
}
