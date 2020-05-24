package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		System.out.println("Program started. Type --help at any time for instructions");
		Map<String, User> Users = new HashMap<>();
		long start = System.currentTimeMillis();
		

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();

			if (input.equals("--help")) {
				System.out.println("hey");
			}
			
			String[] inputs = input.split(" ");
			String userName = inputs[0];
			User currentUser = null;
			if(!Users.containsKey(userName)) {
				currentUser = new User();
				Users.put(userName, currentUser);
				
			} else {
				Users.get(userName);
			}
			
			String message = "";
			if(input.contains("->")) {
				message = input.split(" -> ")[1];
				currentUser.addMessage(message);
			}
			
			for (String eachMessage : currentUser.getMessages()) {
				System.out.println(eachMessage);
			}
		}

	}
	}

