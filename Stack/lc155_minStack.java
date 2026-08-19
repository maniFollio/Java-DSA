import java.util.Stack;

public class lc155_minStack {
    private Stack<Integer> st;
    private Stack<Integer> min_st;

    void minStack() {
        st = new Stack<>();
        min_st = new Stack<>();
    }
    void push(int val){
        st.push(val);
        if(min_st.isEmpty() || val <= min_st.peek()){
            min_st.push(val);
        }
    }
    void pop(){
        if(st.peek().equals(min_st.peek())){
            min_st.pop();
        }
        st.pop();
    }
    int top(){
        return st.peek();
    }
    int getMin(){
        return min_st.peek();
    }
}
