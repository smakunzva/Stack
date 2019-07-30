

package datastructures.stack;


import java.util.EmptyStackException;

// Simple Employee stack class

public class Stack {
	
	private Employee [] employeeStack;
	private int top;


	public Stack(int size) {
		this.employeeStack = new Employee[size];
	}


	public void push(Employee emp) {

		// Because of the array resizing the time complexity is O(n) => linear time complexity
		// First check if the array is full
		if(this.top == this.employeeStack.length) {
			// Resize the array by doubling the size so as to avoid constantly resizing the array
			Employee [] tempArray = new Employee [ 2 * this.employeeStack.length];
			System.arraycopy(this.employeeStack, 0 , tempArray, 0, this.employeeStack.length);
			this.employeeStack = tempArray;
		}

		this.employeeStack[top++] = emp;
	}


	public Employee pop() {

		// Time complexity is O(1) because there is no resizing of the array as it doesn't depend on the number of items
		// When resized time complexity will be O(n)

		if(isEmpty()) {
			throw EmptyStackException();
		}

		// Top contains the next available position on the stack therefore there is nothing at top
		Employee popEmployee = this.employeeStack[--top];
		this.employeeStack[top] = null;

		return popEmployee;
	}


	public int size() {
		// return top since it's not zero based
		return this.top; 
	}

	public Employee peek() {

		if(isEmpty()) {
			throw EmptyStackException();
		}

		return employeeStack[top -1];
	}

	public void printStack() {

		for(int i = top -1 ; i >= 0 ; i--) {
			System.out.println(employeeStack[i]);
		}
	}

	public boolean isEmpty() {
		return this.top == 0;
	}
}