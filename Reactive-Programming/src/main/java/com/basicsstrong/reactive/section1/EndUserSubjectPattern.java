package com.basicsstrong.reactive.section1;

import java.util.HashSet;

public class EndUserSubjectPattern implements SubjectPattern<EndUser, Book> {

    private HashSet<EndUser> obsList;

    public EndUserSubjectPattern() {
        this.obsList = new HashSet<>();
    }

    public void subscribeObserver(EndUser ob) {
        obsList.add(ob);
    }

    public void unsubscribeObserver(EndUser ob) {
        obsList.remove(ob);
    }

    public void notifyObserver(Book book) {
        System.out.println(
                "Book name : " +book.getName() +
                        ",Book Type : "+ book.getType() +
                        ",Price : " + book.getPrice()+
                        ",Author : "+ book.getAuthor()+
                        ", is now "+book.getInStock()+". So, please notify all users.\n"
        );
        obsList.stream().forEach(endUser -> {
            endUser.update(book);
        });
    }
}
