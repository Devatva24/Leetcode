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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode i = head;
        ListNode j = head.next;
        while(j != null) {
            if(i.val != j.val) {
                prev = i;
                i = i.next;
                j = j.next;
            } else {
                while(j != null && i.val == j.val) {
                    j = j.next;
                }
                prev.next = j;
                i = j;
                if(j != null) j = j.next;
            }
        }
        return dummy.next;
    }
}