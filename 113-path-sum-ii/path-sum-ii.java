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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
           List<Integer> list = new ArrayList<>();
           List<List<Integer>> ll = new ArrayList<>();
        if(root==null){
            return ll;
        }
        Pathsum(root, list,ll,targetSum,0);
        return ll;
    }
    public static void Pathsum(TreeNode root, List<Integer> list, List<List<Integer>> ll,int targetSum,int sum){
         if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            sum=sum+root.val;
            list.add(root.val);
            if(sum==targetSum){
                ll.add(new ArrayList(list));
            }
              list.remove(list.size()-1);
        }
        // left call
        sum=sum+root.val;
        list.add(root.val);
        Pathsum(root.left,list,ll,targetSum,sum);
      
        Pathsum(root.right,list,ll,targetSum,sum);
        list.remove(list.size()-1);


    }
}