package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MainProgram {
	
public static void main(String[] args) {
	System.out.println("Program started. Type --help at any time for instructions");
	Map<String, User> userList = new HashMap<>();
	long start = System.currentTimeMillis();
	
	
	while(true) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if(input.equals("--help")) {
			System.out.println("hey");
		}
		
		String[] inputs = input.split(" -> ");
		String userName = inputs[0];
		String message = inputs[1];
		User user = new User();
		//userList.put(userName, user);
		user.addMessage(message);
		
		System.out.println(message);
	}

}
}
