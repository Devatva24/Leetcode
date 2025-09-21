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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode first = dummy.next;
        ListNode second = first.next;
        while(first != null && second != null) {
            ListNode next = second.next;
            //swapping the nodes
            second.next = first;
            first.next = next;
            prev.next = second;

            prev = first;
            first = next;
            
            //condition check for odd and even number of nodes : if odd rest nodes are left as is it is else it will be further swapped
            if(first != null) second = first.next;
        }
        return dummy.next;
    }
}