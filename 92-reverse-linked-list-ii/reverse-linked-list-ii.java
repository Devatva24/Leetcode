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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //left portion
        ListNode prevleft = dummy;
        for (int i = 1; i < left; i++) {
            prevleft = prevleft.next;
        }
        ListNode leftPortion = prevleft.next;
        //right portion
        ListNode rightPortion = dummy;
        for (int i = 0; i < right; i++) {
            rightPortion = rightPortion.next;
        }
        ListNode nextRight = rightPortion.next;

        rightPortion.next = null;
        //reversed
        ListNode headReversed = reverse(leftPortion);
       
        prevleft.next = headReversed;
        while(headReversed.next != null) {
            headReversed = headReversed.next;
        }
        headReversed.next = nextRight;
        return dummy.next;
    }
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}