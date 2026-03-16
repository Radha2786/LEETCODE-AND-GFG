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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return CalcSum(root, targetSum,0);
    }
    public static boolean CalcSum(TreeNode root, int targetSum, int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            sum+=root.val;
            return sum==targetSum;
        }
        sum+=root.val;
        boolean left=CalcSum(root.left, targetSum, sum);
        boolean right=CalcSum(root.right, targetSum, sum);
        // if(left==false){
        //     sum-root.left.val;
        // }else if(right==false){
        //     sum-root.right.val;
        // }
        return left || right;
    }
}