package com.visa.training;
public class FixedArrayStack implements Stack {
	private Object[] stack;
	int top = -1;
	FixedArrayStack(int size)
	{
		stack = new Object[size];
		
	}

	@Override
	public void push(Object o) {
		// TODO Auto-generated method stub
		top++;
		stack[top] = o;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		
		return stack[top--];
	}
	
}
