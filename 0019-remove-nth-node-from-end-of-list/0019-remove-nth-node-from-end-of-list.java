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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        // Step 1: Count the total number of nodes
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Calculate the position of the node to be removed from the start
        int length = count - n;

        // Special case: if the head node is to be removed
        if (length == 0) {
            return head.next;
        }

        // Step 3: Reset temp to head to find the node before the one to be removed
        temp = head;
        for (int i = 1; i < length; i++) {
            temp = temp.next;
        }

        // Step 4: Remove the nth node from end by skipping it in the list
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
