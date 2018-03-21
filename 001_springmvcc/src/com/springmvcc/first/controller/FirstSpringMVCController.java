package com.springmvcc.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
	/*@RequestMapping("/hello")
	public String sayHello()
	{return "hello";
	}*/
	@RequestMapping("/message")
	public String sayMessage(Model m)
	{m.addAttribute("myMessage","i am a pavam girl");
		return "kitchen";
	}
	@RequestMapping("/model")
	public ModelAndView sayMessage1(ModelAndView mv)
	{mv.addObject("food","chicken is bae");
	mv.setViewName("canteen");
		return mv;
	}
}


