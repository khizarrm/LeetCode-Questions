class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minVal;
    int min = 100; 
    int size = 0; 
    public MinStack() {
        stack = new Stack();
        minVal = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if (size == 0){
            min = val; 
        } else {
            min = Math.min(val, min);
        }
        minVal.push(min);
        size++;
    }
    
    public void pop() {
        stack.pop();
        minVal.pop();
        if (!minVal.isEmpty()){
            min = minVal.peek();
        }
        size--;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minVal.peek();
    }
}

