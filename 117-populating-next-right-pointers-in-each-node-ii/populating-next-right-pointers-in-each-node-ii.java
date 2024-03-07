/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root==null){
            return null;
        }
        return Connect(root);
    }
      public static Node Connect(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current==null){
                if(queue.isEmpty()){
                //  list.add(new ArrayList<>(ll));
                //  ll.clear();
                 break;  
                 }else{
                    queue.add(null);
                    // list.add(new ArrayList<>(ll));
                    // ll.clear();
                    continue;
                    }
            }
            // ll.add(current.val);
            current.next= queue.peek();
            if(current.left!=null){
                queue.add(current.left);
            }
             if(current.right!=null){
                queue.add(current.right);
            }}
            return root;
    }
}