/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode s = head;
        ListNode f = head;

        // Detect if a cycle exists
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                // Cycle detected, now find the start of the cycle
                s = head;
                while (s != f) {
                    s = s.next;
                    f = f.next;
                }
                return s;  // The start of the cycle
            }
        }

        return null;  // No cycle
    }
}
