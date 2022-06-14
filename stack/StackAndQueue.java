package stack;

import java.util.Stack;

public class StackAndQueue {
		public static void main(String[] args) {
		StackAndQueue list = new StackAndQueue();
		list.create();
		list.peekAndPop();
	}
void create() {
	Stack<Integer> st= new Stack<>();  
    st.push(56);
    st.push(30);
    st.push(70);
    System.out.println("the element are: " + st);
}
	void peekAndPop() {
		Stack<Integer> st1= new Stack<>();  
	    st1.push(56);
	    st1.push(30);
	    st1.push(70);
	    System.out.println("the element are: " + st1);
	    System.out.println("the element are: " + st1.peek());
	    System.out.println("the element are: " + st1.pop());
		
	}
}
