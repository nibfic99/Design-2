#Time complexity : O(1)
#Space complexity : O(1)

class MyQueue {
    
    Stack<Integer> l;
    Stack<Integer> m;
    int front;

    public MyQueue() {
        l=new Stack<>();
        m=new Stack<>();
    }
    
    public void push(int x) {
        if(l.empty())
        {
            front=x;
        }
        l.push(x);
    }
    
    public int pop() {
     if(m.isEmpty())
     {
         while(!l.isEmpty())
         {
             m.push(l.pop());
         }
     }
        return m.pop();
    }
    
    public int peek() {
        if(!m.isEmpty())
        {
            return m.peek();
        }
        return front;
    }
    
    public boolean empty() {
        
        return l.isEmpty() && m.isEmpty();
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