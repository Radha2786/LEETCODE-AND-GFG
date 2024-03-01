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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        st1.add(root);
        while(!st1.isEmpty()){
            st2.add(st1.pop());
            TreeNode node = st2.peek();
            if(node.left!=null){
                st1.add(node.left);
            }
             if(node.right!=null){
                st1.add(node.right);
            }
        }
        while(!st2.isEmpty()){
            TreeNode cur = st2.pop();
            list.add(cur.val);
        }
        return list;

    }
}