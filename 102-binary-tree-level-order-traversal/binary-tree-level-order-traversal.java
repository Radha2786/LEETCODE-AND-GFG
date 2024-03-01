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
          return ls ;
      }
      return levelOrder(list,ls,root);
      
    }
    public static List<List<Integer>> levelOrder( List<Integer> list, List<List<Integer>> ls, TreeNode root){
          Queue<TreeNode> queue = new LinkedList<>();
          queue.add(root);
          queue.add(null);
          while(!queue.isEmpty()){
              TreeNode rs=queue.remove();
              
            //   System.out.println(rs.val);
              if(rs==null){
                  System.out.println(list);
                  ls.add(new ArrayList(list));
                  System.out.println("***");
                  System.out.println(ls);
                  list.clear();
                  if(queue.isEmpty()){
                     break; 
                  }else{
                      queue.add(null);
                      continue;
                  }
              }else{
                  list.add(rs.val);
              System.out.println("---");
              System.out.println(list);
              if(rs.left!=null){
                   System.out.println(rs.left.val);
                  queue.add(rs.left);
              }
               if(rs.right!=null){
                    System.out.println(rs.right.val);
                  queue.add(rs.right);
              }
              }
          }
           return ls;
        
    }

     
}
