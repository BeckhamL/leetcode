class MyQueue {

    private Stack<Integer> list;
    private Stack<Integer> list2;
    private int head;

    /** Initialize your data structure here. */
    public MyQueue() {
        list = new Stack<>();
        list2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (list.isEmpty()) {
            head = x;
        }
        while (!(list.isEmpty())) {
            list2.push(list.pop());
        }
        list2.push(x);
        while (!(list2.isEmpty())) {
            list.push(list2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int pop = list.pop();

        if (!(list.isEmpty())) {
            head = list.peek();
        }
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        return head;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
