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
    class BHPair{
        int height=0;
        boolean flag=true;
    }
    public boolean isBalanced(TreeNode root) {
        BHPair ans= Balanced(root);
        return ans.flag;
    }
    public BHPair Balanced(TreeNode root){
        if(root==null){
            return new BHPair();
        }
        BHPair left = Balanced(root.left);
        BHPair right = Balanced(root.right);
        BHPair self = new BHPair();
        self.flag = left.flag && right.flag && Math.abs(left.height-right.height)<2;
        self.height = Math.max(left.height,right.height)+1;
        return self;
       
    }
}