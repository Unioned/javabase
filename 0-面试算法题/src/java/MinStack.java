import java.util.Stack;

class MinStack {

    Stack<Long> A;
    Long min;
    /** initialize your data structure here. */
    public MinStack() {
        A = new Stack<>();
    }

    public void push(int x) {
        if (A.isEmpty()){
            A.push(0L);
            min = (long) x;
        }else {
            A.push((long) x - min);
            min = Math.min(x,min);
        }
    }

    public void pop() {
        if (A.peek() >= 0){
            A.pop();
        }else{
            min = min - A.pop();
        }
    }

    public int top() {
        if (A.peek() >= 0){
            return Math.toIntExact(A.peek() + min);
        }else{
            return Math.toIntExact(min);
        }
    }

    public int min() {
        return Math.toIntExact(min);
    }
}
