package org.launchcode.blogz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login(){
		
		return "login";
	}

}
