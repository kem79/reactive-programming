package com.basicsstrong.reactive.section1;

public interface SubjectPattern<T, B> {
	
	public void subscribeObserver(T ob);
	
	public void unsubscribeObserver(T ob);
	
	public void notifyObserver(B ob);

}
