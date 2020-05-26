package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwitterProgram {
	
	public Map<String, User> userList = new HashMap<>();
	
	public void start() {
		
		System.out.println("Program started. Type -help at any time for instructions");
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			//Parse Input
			String[] inputs = input.split(" ");
			String userName = inputs[0];
			String function = null;
			String argument = "";
			
			if(inputs.length>1) {
				function = inputs[1];
			}
			
			if(inputs.length>2) {
				for(int i = 2; i<inputs.length; i++) {
					argument = argument + " " + inputs[i];
				}
			}
			
			User currentUser = returnUser(userName);
			if(function!=null) {
				executeFunction(currentUser, function, argument);
			} else {
				List<Message> myMessages = currentUser.getMessages();
				myMessages.stream().forEach(System.out::println);
			}
			
		}

	}
	
	private void executeFunction(User user, String function, String arguments) {
		if(function.equals("->")) {
			Message newMessage = new Message();
			newMessage.setStringMessage(arguments);
			user.addMessage(newMessage);
		} else if(function.equals("follows")) {
			if(userList.containsKey(arguments)) {
				User userToFollow = userList.get(arguments);
				user.followUser(userToFollow);
			} else {
				System.out.println("Username "+ "\""+ arguments + "\"" + " does not exist");
			}
		}
	}
	
	private User returnUser(String userName) {
		User currentUser = null;
		if(!userList.containsKey(userName)) {
			User user = new User();
			user.setUserName(userName);
			userList.put(userName, user);
			currentUser = user;
		} else {
			currentUser = userList.get(userName);
		}
		return currentUser;
	}
	
	private void printActiveUsers() {
		for(Map.Entry<String, User> user : userList.entrySet()) {
			System.out.print(user.getKey());
		}
	}
	
	private void printWall(User currentUser) {
		//create a list of messages with userNames and timeStamps
		
	}

}
