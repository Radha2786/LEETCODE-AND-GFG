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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        return removeleaf(root,target);
    }
    public static TreeNode removeleaf(TreeNode root, int target){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null && root.val==target){
            return null;
        }
        root.left=removeleaf(root.left,target);
        root.right=removeleaf(root.right,target);
        if(root.left==null && root.right==null && root.val==target){
            return null;
        }else{
            return root;
        }
        
    }
}