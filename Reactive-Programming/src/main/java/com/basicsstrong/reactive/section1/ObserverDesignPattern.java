package com.basicsstrong.reactive.section1;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		
		Book book = new Book("Goosebumps", "Horror", "Xyz", 200,
				"SoldOut");
		
		EndUser user1 = new EndUser("Bob");
		EndUser user2 = new EndUser("Rob");

		book.subscribeObserver(user1);
		book.subscribeObserver(user2);
		
		System.out.println(book.getInStock());
		
		book.setInStock("In Stock");
		
	}

}

