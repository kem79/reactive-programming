package com.basicsstrong.reactive.section1;

public class EndUser extends UserObserver {
	
	String name;
	
	EndUser(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
