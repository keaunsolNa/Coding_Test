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

        ListNode dummyNode = new ListNode();
        ListNode current = head;

        while (current != null) {

            ListNode nextNode = current.next;

            current.next = dummyNode.next;
            dummyNode.next = current;
          
            current = nextNode;
        }

        while (head != null) {

            if (head.next != dummyNode.next) return false;
        }

        return true;

    }
}