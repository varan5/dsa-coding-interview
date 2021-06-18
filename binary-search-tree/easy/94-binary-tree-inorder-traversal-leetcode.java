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
// Time:  O(n) - Where 'n' is the number of nodes in the tree
// Space: O(n) - Since we are using an ArrayList to store the root.val for each node

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        
        resultArray = inorderTraversalHelper(root, resultArray);
        return resultArray;
    }
    
    public static ArrayList<Integer> inorderTraversalHelper(TreeNode root, ArrayList resultArray) {
        if (root == null)
            return resultArray;
        inorderTraversalHelper(root.left, resultArray);
        resultArray.add(root.val);
        inorderTraversalHelper(root.right, resultArray);
        
        return resultArray;
    }
}
                                    
