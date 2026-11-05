class MinStack {
  private Deque<Integer> stack;
  private Deque<Integer> minStack;

  public MinStack() {
    stack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
  }

  public void push(int val) {
    stack.push(val);
    if(minStack.isEmpty()) {
      minStack.push(val);
    } else {
      minStack.push(Math.min(minStack.peek(), val));
    }
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    System.out.println(stack.peek());
    return stack.peek();
  }

  public int getMin() {
    System.out.println(minStack.peek());
    return minStack.peek();
  }
}