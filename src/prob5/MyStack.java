package prob5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack<T> {
	private int top;
	private T[] buffer;

	@SuppressWarnings("unchecked")	// warning 되지마라 선언
	public MyStack(int capacity) {
		top = -1;
		buffer = (T[])new Object[capacity];
	}

	@SuppressWarnings("unchecked")	// warning 되지마라 선언
	public void push(T s) {
		if (top < buffer.length - 1)
			buffer[++top] = s;
		else {
			T temp[] = (T [])new Object[buffer.length + 1];
			int i;
			for (i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
			temp[i] = s;
			buffer = temp;
			temp = null;
			++top;
		}
	}

	public T pop() throws MyStackException {
		if (top != -1)
			return buffer[top--];

		return (T)(new MyStackException() + "");
	}

	public boolean isEmpty() {
		return top == -1;
	}
}