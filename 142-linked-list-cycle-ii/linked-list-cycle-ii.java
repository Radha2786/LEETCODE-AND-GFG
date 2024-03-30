/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null){
            return null;
        }
        ListNode MeetingPoint=hasCycle(head);
        if(MeetingPoint==null){
            return null;
        }else{
            ListNode slow=head;
            ListNode fast = MeetingPoint;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        
    }
      public ListNode hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return slow;
            }
        }
        return null;
    }
}