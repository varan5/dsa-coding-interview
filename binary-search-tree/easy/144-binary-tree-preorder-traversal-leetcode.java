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
 
// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the number of nodes present in the tree
// Space: O(n) - Since we are using an ArrayList to store the root.val for each node

class Solution {
    List<Integer> resultArray = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return resultArray;
        resultArray.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return resultArray;
    }
}
