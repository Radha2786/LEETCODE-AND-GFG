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
    public int sumNumbers(TreeNode root) {
        int finalsum=0;
        return Sum(root,0,finalsum);
        // return finalsum;
    }
    public static int Sum(TreeNode root,int sum , int finalsum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            sum=sum*10+root.val;
            // finalsum=finalsum+sum;
            // return finalsum;
            return sum;
        }
        // left call
        sum=sum*10+root.val;
        int left=Sum(root.left,sum,finalsum);
        int right=Sum(root.right,sum,finalsum);
        return left+right;
    }
}