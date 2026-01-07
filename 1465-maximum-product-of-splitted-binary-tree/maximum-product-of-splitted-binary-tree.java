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
    long totalSum = 0;
    long maxProduct = 0;
    private final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        //1st step is to find the sum of whole tree
        totalSum = TotalSum(root);
        //2nd step calculate subtree sum s1
        SubtreeSum(root);
        return (int)(maxProduct % MOD);
    }
    public long TotalSum(TreeNode root){
        if(root==null){
            return 0;
        }
        long left=TotalSum(root.left);
        long right=TotalSum(root.right);
        return left+right+root.val;
    }

    public long SubtreeSum(TreeNode root){
        if(root==null){
            return 0;
        }
        long left=SubtreeSum(root.left);
        long right=SubtreeSum(root.right);
        long subtreesum = left+right+root.val;
        long remainingsum = totalSum - subtreesum; 
        maxProduct = Math.max(maxProduct, subtreesum*remainingsum);
        return subtreesum;
    }
}