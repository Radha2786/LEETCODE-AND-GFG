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
       return MaxLevel(root);
    }
    public static int MaxLevel(TreeNode root){
        int sum=0;
        int max = Integer.MIN_VALUE;
          Queue<TreeNode> queue = new LinkedList<>();
          queue.add(root);
          queue.add(null);
          int count=1;
          int maxheight=1;
           while(!queue.isEmpty()){
              TreeNode rs=queue.remove();
              if(rs==null){
                  if(sum>max){
                      max=sum;
                      maxheight=count;
                  }
                  count++;
                  sum=0;
                  if(queue.isEmpty()){
                     break; 
                  }else{
                      queue.add(null);
                      continue;
                  }
              }else{
                  sum=sum+rs.val;
              if(rs.left!=null){
                  queue.add(rs.left);
              }
               if(rs.right!=null){
                  queue.add(rs.right);
              }
              }
          }
           return maxheight;
    }
   
}