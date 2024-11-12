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
    public void reorderList(ListNode head) {
        //reverse the second half of list 
        ListNode slow = head; 
        ListNode fast = head.next; 
        while (fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 
        }

        ListNode second = slow.next; 
        slow.next = null; 
        ListNode prev = null; 
        while (second != null){
            ListNode temp = second.next; 
            second.next = prev; 
            prev = second; 
            second = temp; 
        }

        ListNode l = head; 
        ListNode r = prev; 
        while (r != null){
            ListNode tmp1 = l.next; 
            ListNode tmp2 = r.next; 
            l.next = r; 
            r.next = tmp1; 
            l = tmp1; 
            r = tmp2; 
        }
    }
}

