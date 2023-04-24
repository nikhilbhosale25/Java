package Tester;

import NewPkg.Book;

public class TestBook {
	public static void main(String[] args) {
		Book obj = null;
		obj = new Book();
		obj.display();
		// obj = new Book("Sonali", 11, "abc", 20.20f);
		obj.acceptInfo("Sonali", 11, "abc", 20.20f);
		obj.display();
	}
}