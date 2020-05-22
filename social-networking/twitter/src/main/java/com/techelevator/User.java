package com.techelevator;

import java.util.List;

public class User {
	
	private String userName;
	private List<String> messages;
	private List<User> following;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public List<String> getMessages() {
		return messages;
	}
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public List<User> getFollowing() {
		return following;
	}
	
	public void setFollowing(List<User> following) {
		this.following = following;
	}
	
	public void addMessage(String message) {
		messages.add("hey");
	}
	
	public void followUser(User User) {
		following.add(User);
	}
	
}
