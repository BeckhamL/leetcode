/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode curr = head;
        ListNode prev = head;

        if(head == null){
            return null;
        }

        // Takes care of the case where the head is val
        while(head.val == val){

            if(head.next == null){
                return null;
            }
            head = head.next;
            curr = head;
            prev = head;
        }

        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else
            {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}
