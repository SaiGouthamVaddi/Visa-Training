package com.visa.training;

public class StackApp {

	public static void main(String[] args) {
		StackUser su = new StackUser();
		FixedArrayStack s = new FixedArrayStack(10);
		su.fill(s);
		su.empty(s);
	}
}
