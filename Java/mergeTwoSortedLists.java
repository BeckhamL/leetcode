/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 // Iterative Solution
 // I look at both lists and see which node is less, whichever is less I add to my ans list
 // At the end, if any of the lists are not empty, I append to the end of ans
 // Not quite sure why I need the 'temp' node though, doesn't work without it
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                ans.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            else {
                ans.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            ans = ans.next;
        }

        if (l1 != null) {
            ans.next = l1;
        }

        if (l2 != null) {
            ans.next = l2;
        }

        return temp.next;
    }
}

// Recursive Solution
// Little more difficult to understand
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
