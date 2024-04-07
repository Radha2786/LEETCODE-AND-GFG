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
    String smallest= null;
    public String smallestFromLeaf(TreeNode root) {
        Sum(root,new StringBuilder(""));
        return smallest;
    }
    public void Sum(TreeNode root, StringBuilder sb) {

        sb.append((char)(root.val+97));
        if(root.left!=null){
            Sum(root.left,sb);
        }
        if(root.right!=null){
            Sum(root.right,sb);
        }
        // reached on leaf node
        if(root.left==null && root.right==null){
            String temp=sb.reverse().toString();
            System.out.println(temp);
            if(smallest==null || temp.compareTo(smallest)<0){
                smallest = temp;
               
            }
              sb.reverse();
           
        }
        sb.deleteCharAt(sb.length()-1);
    }
}