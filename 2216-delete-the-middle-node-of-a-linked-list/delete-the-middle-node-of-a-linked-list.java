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
    public ListNode deleteMiddle(ListNode head) {
        // finding middle 
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next;
            count++;
        }
        ListNode middle = slow;
        if(count==0){
            middle=null;
            return null;
        }
        ListNode beforeCount=getElement(count-1,head);
        ListNode afterCount=getElement(count+1,head);
        beforeCount.next=afterCount;
        middle.next=null;
        return head;
    }
    public static ListNode getElement(int index,ListNode head){
        ListNode temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
}