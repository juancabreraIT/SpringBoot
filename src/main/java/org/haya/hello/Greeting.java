package org.haya.hello;

public class Greeting {

	private final long ID;
	private final String CONTENT;
	
	public Greeting(long id, String content) {
		ID = id;
		CONTENT = content;
	}
	
	public long getId() {
		return ID;
	}
	
	public String getContent() {
		return CONTENT;
	}
}
