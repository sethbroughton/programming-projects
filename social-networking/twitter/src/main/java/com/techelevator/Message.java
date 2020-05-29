package com.techelevator;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Message implements Comparable<Message>{
	
	private String stringMessage;
	private LocalDateTime timeStamp;
	private String elapsedTime;
	private User userPosted;
	
	public Message(){
		this.timeStamp = LocalDateTime.now();
	}
	
	public String getStringMessage() {
		return stringMessage;
	}
	public void setStringMessage(String stringMessage) {
		this.stringMessage = stringMessage;
	}
	
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp() {
		this.timeStamp = LocalDateTime.now();
	}
	
	public String getElapsedTime() {
		String elapsedTime = "";
		Duration duration = Duration.between(getTimeStamp(), LocalDateTime.now());
		
		long days = duration.toDays();
		long hours = duration.toHours();
		long minutes = duration.toMinutes();
		long seconds = duration.getSeconds();
		
		if(days>0) {
			return days==1 ? "1 day ago" : days + " days ago";
		} else if(hours>0) {
			return hours==1 ? "1 hour ago" : hours + " hours ago";
		} else if(minutes>0) {
			return minutes==1 ? "1 minute ago" : minutes + " minutes ago";
		} else {
			return seconds==1 ? "1 second ago" : seconds + " seconds ago";
		}
		
	}

	public void setElapsedTime(String elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public User getUserPosted() {
		return userPosted;
	}

	public void setUserPosted(User user) {
		this.userPosted = user;
	}
	
	@Override
	public String toString() {
		return this.stringMessage + " (" + getElapsedTime() + ")";
	}

	@Override
	public int compareTo(Message message) {
		
		return message.timeStamp.compareTo(this.timeStamp);
	}
	

}
