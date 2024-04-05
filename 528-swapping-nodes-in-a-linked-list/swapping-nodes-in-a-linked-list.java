/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode kthNode= getNode(head,k);
    //    System.out.println(kthNode.val);
       int temp = kthNode.val;
       int size=size(head);
    //    System.out.println(size);
       int newk=(size-k)+1;
       ListNode kthNodefromlast=getNode(head,newk);
    //    System.out.println(kthNodefromlast.val);
       kthNode.val=kthNodefromlast.val;
    //    System.out.println(temp);
       kthNodefromlast.val=temp;
       return head;

    }
    public static ListNode getNode(ListNode head, int k){
        ListNode temp = head;
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static int size(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}