package com.inheritance4;

public class MathTeacher extends ClassTeacher {

	void solveEqations() {
		System.out.println("Good subject");
	}

	public static void main(String[] args) {
		MathTeacher m = new MathTeacher();
		m.solveEqations();
	}

}
