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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head; // Return head instead of null
        }

        // Find the length of the list
        ListNode temp = head;
        int count = 1; // Start counting from 1 since we are already at head
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        // Connect the last node to the head to make it a circular list
        temp.next = head;

        // Find the number of steps to the new head
        k = k % count;
        int length = count - k;

        // Find the new head and the new tail
        while (length-- > 0) {
            temp = temp.next;
        }
        head = temp.next;

        // Break the cycle
        temp.next = null;

        return head;
    }
}