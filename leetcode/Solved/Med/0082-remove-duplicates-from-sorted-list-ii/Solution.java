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

        ListNode dummy = new ListNode(0, head);
        ListNode previous = dummy;
        ListNode current = head;
      
        while (current != null) {

            while (current.next != null && current.next.val == current.val) {
                current = current.next;
            }
          
            if (previous.next == current) {
                previous = current;
            } else {
                previous.next = current.next;
            }
          
            current = current.next;
        }
      
        return dummy.next; 
        
    }
}