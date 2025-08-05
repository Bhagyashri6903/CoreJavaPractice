package com.inheritance3;

public class Novel extends Book {

	void getGenre() {

		System.out.println("Novel is goood");
	}

	public static void main(String[] args) {

		Novel n = new Novel();
		n.getGenre();
	}

}
