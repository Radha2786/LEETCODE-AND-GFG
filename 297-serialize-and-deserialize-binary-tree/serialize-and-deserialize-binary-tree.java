/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur==null){
               res.append("n ");
               continue;
               // null ka left right kuch hoga hi ni
            }
            res.append(cur.val+" ");
            q.add(cur.left);
            q.add(cur.right);
        }
        System.out.println(res.toString());
        return res.toString();
        
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] values=data.split(" ");
          Queue<TreeNode> q = new LinkedList<>();
        TreeNode root= new TreeNode(Integer.parseInt(values[0]));
      
        q.add(root);
        for(int i=1;i<values.length;i++){
            TreeNode parent=q.poll();
            if(!values[i].equals("n")){
                 TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                 parent.left=left;
                 q.add(left);
            }
             if(!values[++i].equals("n")){
                 TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                 parent.right=right;
                 q.add(right);
            }
           
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));