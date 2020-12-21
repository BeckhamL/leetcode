function reverseList(head: ListNode | null): ListNode | null {

    let rev = null;
    let curr = head;
    
    while (curr !== null) {
        let next = curr.next;
        curr.next = rev;
        rev = curr;
        curr = next;
    }
    
    return rev;
};
