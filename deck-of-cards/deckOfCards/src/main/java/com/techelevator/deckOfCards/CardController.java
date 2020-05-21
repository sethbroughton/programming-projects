package com.techelevator.deckOfCards;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class CardController {

//	@RequestMapping("/")
//	public String displayGreeting() {
//		
//		return "greeting";
//	}
	
	@RequestMapping("/game")
	public String showForumList(HttpServletRequest request) {
		Deck deck = new Deck();
		request.setAttribute("cardList", deck.deal());
		return "cards";
	}
}
