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
			if(days==1) {
				elapsedTime = "1 day ago";
			} else {
				elapsedTime = days + " days ago";
			}
		}
		else if(hours>0) {
			if(hours==1) {
				elapsedTime = "1 hour ago";
			} else {
				elapsedTime = hours + " hours ago";
			}
		} else if(minutes>0) {
			if(minutes==1) {
				elapsedTime = "1 minute ago";
			} else {
				elapsedTime = minutes + " minutes ago";
			}
		} else {
			if(seconds<=1) {
				elapsedTime = "1 second ago";
			} else {
				elapsedTime =  seconds + " seconds ago";
			}
			
		}
		return elapsedTime;
	}

	public void setElapsedTime(String elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	@Override
	public String toString() {
		return this.stringMessage + " (" + getElapsedTime() + ")";
	}

	@Override
	public int compareTo(Message message) {
		return message.timeStamp.compareTo(this.timeStamp);
	}

	public User getUserPosted() {
		return userPosted;
	}

	public void setUserPosted(User user) {
		this.userPosted = user;
	}
	

}
