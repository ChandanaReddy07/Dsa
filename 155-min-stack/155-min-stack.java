class MinStack {
 Stack<Integer> minStack;
    Stack<Integer> s; 
    
    public MinStack() {
        this.minStack = new Stack<>();
        this.s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
            return;
        }
        if(minStack.peek() > val){
            minStack.push(val);
        }
        else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        minStack.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */