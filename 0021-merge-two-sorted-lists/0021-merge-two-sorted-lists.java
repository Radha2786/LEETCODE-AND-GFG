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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode Dummy = new ListNode(-1);
        ListNode temp = Dummy;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                temp=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                temp=head2;
                head2=head2.next;
            }
        }
        if(head1!=null){
            temp.next=head1;
        }else{
            temp.next=head2;
        }
        return Dummy.next;
    }
}