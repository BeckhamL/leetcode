class MyStack {

    private Queue<Integer> list;
    private Queue<Integer> list2;
    private int head;

    /** Initialize your data structure here. */
    public MyStack() {
        list = new LinkedList<>();
        list2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {

        if (list.isEmpty()) {
            head = x;
        }

        list2.add(x);
        while (!(list.isEmpty())) {
            list2.add(list.poll());
        }

        while (!(list2.isEmpty())) {
            list.add(list2.poll());
        }


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.poll();
    }

    /** Get the top element. */
    public int top() {
        return list.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (list.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
