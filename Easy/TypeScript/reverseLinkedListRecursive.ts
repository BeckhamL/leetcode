function reverseList(head: ListNode | null): ListNode | null {

    return helper(head, null);
};

function helper(curr: ListNode, prev) {
    
    if (curr === null) {
        return prev;
    } 
    
    let next = curr.next;
    curr.next = prev;

    return helper(next, curr);
}
