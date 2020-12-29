package com.basicsstrong.reactive.section1;

public class UserObserver implements ObserverPattern<Book> {
    public void update(Book book) {
        System.out.println("Hello ! we are glad to notify you that your book is now " +
                book.getInStock());
    }
}
