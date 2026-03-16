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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ls = new ArrayList<>();
        if(root==null){
            return ls;
        }
        levelOrderTraversal(root,list,ls);
        return ls;
    }
    public static void levelOrderTraversal(TreeNode root, List<Integer> list, List<List<Integer>> ls){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode res=queue.remove();
            if(res==null){
                ls.add(new ArrayList<>(list));
                list.clear();
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                    continue;
                }
            }else{
                list.add(res.val);
                if(res.left!=null){
                    queue.add(res.left);
                }
                if(res.right!=null){
                    queue.add(res.right);
                }
            }
        }
    } 
}