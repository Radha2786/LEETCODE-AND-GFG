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

//  1st step =  finding mid 
// 2nd step = reversing after mid+1 
//  3rd step = iterate and find the max 
class Solution {
    public int pairSum(ListNode head) {
        int n=getSize(head);
        ListNode middle = middleNode(head);
        ListNode end = reverseList(middle);
        ListNode start = head;
        int max =0;
        for(int i=0;i<n/2;i++){
            max= Math.max(start.val+end.val,max);
            start = start.next;
            end = end.next;
        }
        return max;
    }

      public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head ;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
    
     public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=temp;
            temp = curr;
            curr = next;
        }
        return temp;
    }

    public int getSize(ListNode head){
        ListNode curr = head;
        int count =0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

}