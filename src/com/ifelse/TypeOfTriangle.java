package com.ifelse;

public class TypeOfTriangle {

	public static void main(String[] args) {
		int sidea = 12;
		int sideb = 11;
		int sidec = 14;
		if (sidea == sideb && sideb == sidec) {
			System.out.println("Equilateral Triangle");
		} else if (sidea == sideb || sideb == sidec || sidec == sidea) {
			System.out.println("Isosceles Triangle");

		} else {
			System.out.println("Scalene Triangle");
		}
	}

}
