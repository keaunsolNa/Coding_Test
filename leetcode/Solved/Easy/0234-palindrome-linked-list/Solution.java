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

        // while (dummyNode != null) System.out.print(dummyNode.next.val + " ");

        System.out.println("C");

        // ListNode current = head;
        
        // while (current != null)  {

        //     ListNode next = current.next;
        //     System.out.print(next.val + " ");
        // }
        
        // while (head != null) {

        //     if (head.next.val != dummyNode.next.val) return false;
        // }

        return true;

    }
}