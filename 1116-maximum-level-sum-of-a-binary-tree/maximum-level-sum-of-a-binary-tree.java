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
    public int maxLevelSum(TreeNode root) {
        return FindMaxLevel(root);
    }
    public static int FindMaxLevel(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level=1;
        int MaxLevel=level;
        int MaxSum=Integer.MIN_VALUE;
        int sum=0;
        while(!queue.isEmpty()){
            TreeNode curr = queue.remove();
            if(curr==null){
                //we found 1 level
                if(sum>MaxSum){
                    MaxSum=sum;
                    MaxLevel=level;
                }
                level++;
                sum=0;
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                    continue;
                    //for adding another level
                }
            }else{
                sum+=curr.val;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
        }
        return MaxLevel;
    }
}