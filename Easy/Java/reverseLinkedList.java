/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode rev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }
        return rev;
    }
}
