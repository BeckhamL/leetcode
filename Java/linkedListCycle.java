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
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        if (head.next == null) {
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (slow != null && fast != null && fast.next != null) {
            if (fast.val == slow.val) {
                return true;
            }
            else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return false;
    }
}

// Recursive Solution
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        else if (head.next == head) {
            return true;
        }
        else {
            head.next = head.next.next;
            return hasCycle(head.next);
        }
    }
}
