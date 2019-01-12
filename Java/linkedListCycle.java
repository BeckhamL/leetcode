// Solution: keep a fast and slow pointer. If there is a cycle eventually the 2 pointers will align
// Runtime: O(n)

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

        while (fast != null && fast.next != null) {
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

// Solution:
// Runtime: O(n)

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
