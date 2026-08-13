class MyStack {

    private Deque<Integer> primaryQueue = new ArrayDeque<>();
    private Deque<Integer> auxiliaryQueue = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {

        auxiliaryQueue.offer(x);
      
        while (!primaryQueue.isEmpty()) {
            auxiliaryQueue.offer(primaryQueue.poll());
        }
      
        Deque<Integer> temp = primaryQueue;
        primaryQueue = auxiliaryQueue;
        auxiliaryQueue = temp;
    }
    
    public int pop() {
        return primaryQueue.poll();
    }
    
    public int top() {
        return primaryQueue.peek();
    }
    
    public boolean empty() {
        return primaryQueue.isEmpty();
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