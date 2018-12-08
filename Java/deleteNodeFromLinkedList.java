/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        // Since I cant access the previous node, this is a cheeky solution.
        // I change my nodes value to the next, essentially making a "copy"
        // I then change the nodes pointer to the next next
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        temp.next = null;
    }
}
