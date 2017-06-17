class MinStack {
    /** initialize your data structure here. */
    private class StackNode<Integer>{
        private int data;
        private int min;
        private StackNode<Integer> next;
        public StackNode(int data, int min){
            this.data = data;
            this.min = min;
        }
    }
      private StackNode top;
    MinStack() {
        
    }
    
    void push(int x) {
        StackNode<Integer> t = new StackNode(x, x);
        if(top==null){
           top = new StackNode(x, x);
        }else{
            StackNode n = new StackNode(x,Math.min(top.min,x));
            n.next = top;
            top=n;
        }
    }
    
    void pop() {
        if (top != null)
        top = top.next;
    }
    
    int top() {
        return top.data;
    }
    
    int getMin() {
        return top.min;
        
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
