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
    public List<Integer> inorderTraversal(TreeNode root) {
       TreeNode node = root ; 
       Stack<TreeNode> st = new Stack<>();
       List<Integer> list = new ArrayList<>();
       while(true){
           if(node!=null){
               st.add(node);
               node =node.left;
           }else{
               if(st.isEmpty()){
                   break;
               }
              node = st.pop();
              list.add(node.val);
              node = node.right;
           }
       } 
       return list;
    }
}