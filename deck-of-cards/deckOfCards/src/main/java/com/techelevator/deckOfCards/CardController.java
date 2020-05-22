package com.techelevator.deckOfCards;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class CardController {

	@Autowired
	CardDAO cardDao;
	
	@RequestMapping("/")
	public String showCardList(HttpServletRequest request) {
		request.setAttribute("cardList", cardDao.listAllCards());
		return "cards";
	}
	
	@RequestMapping("/shuffle")
	public String shuffleDeck(HttpServletRequest request) {
		request.setAttribute("cardList", cardDao.shuffle());
		return "cards";
	}
}
