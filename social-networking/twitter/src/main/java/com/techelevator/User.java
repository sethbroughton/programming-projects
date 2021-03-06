package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

	private String userName;
	private List<Message> messages = new ArrayList<>();
	private List<User> following = new ArrayList<>();

	User() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public void addMessage(Message message) {
		messages.add(message);
	}

	public void followUser(User user) {
		following.add(user);
	}

	public List<Message> createWall() {

		List<User> followers = getFollowing();
		List<Message> wallMessages = new ArrayList<>();
		
		followers.stream()
			.flatMap(follower -> follower.messages.stream())
			.forEach(m -> wallMessages.add(m));
		
		wallMessages.addAll(getMessages());
		Collections.sort(wallMessages);

		return wallMessages;
	}

}
