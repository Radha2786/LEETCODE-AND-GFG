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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> st = new Stack();
        st.add(root);
        while(!st.isEmpty()){
            TreeNode cur=st.pop();
            list.add(cur.val);
            if(cur.right!=null){
                st.add(cur.right);
            }
            if(cur.left!=null){
                st.add(cur.left);
            }

        }
        return list;
    }
}