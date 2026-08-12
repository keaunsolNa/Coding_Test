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
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;
      
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
      
        ListNode current = slow.next;
        slow.next = null; 
      
        ListNode previous = null;
        while (current != null) {

            ListNode temp = current.next;  
            current.next = previous;       
            previous = current;             
            current = temp;                 
        }
      
        while (previous != null) {

            if (previous.val != head.val) return false;  
            previous = previous.next;
            head = head.next;
        }
      
        return true;

    }
}