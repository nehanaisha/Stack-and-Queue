package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
	public static void main(String[] args) {
		StackAndQueue list = new StackAndQueue();
		list.create();
		list.peekAndPop();
		list.queue();
	}

	void create() {
		Stack<Integer> st = new Stack<>();
		st.push(56);
		st.push(30);
		st.push(70);
		System.out.println("the element are: " + st);
	}

	void peekAndPop() {
		Stack<Integer> st1 = new Stack<>();
		st1.push(56);
		st1.push(30);
		st1.push(70);
		System.out.println("the element are: " + st1);
		System.out.println("the element are: " + st1.peek());
		System.out.println("the element are: " + st1.pop());
	}

	void queue() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(56);
		que.add(30);
		que.add(70);
		System.out.println("the element are: " + que);
		System.out.println("the element are: " + que.remove());
		System.out.println("the element are: " + que).;

	}
}
