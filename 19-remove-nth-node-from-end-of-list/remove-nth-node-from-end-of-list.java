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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=size(head);
        if(count==1){
            return null;
        }
        int index = count-n;
        if(index==0){
            head=head.next;
            return head;
        }
       ListNode current = getNode(index,head);
       ListNode prev = getNode(index-1,head);
       prev.next = current.next;
       current.next=null;
       return head;
    }
    public static int size(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static ListNode getNode(int index,ListNode head){
        ListNode temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
}