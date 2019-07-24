package com.example.hotel.myHotel.controller;

import com.example.hotel.myHotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;



	@RequestMapping("/hello")
	public ModelAndView helloOne(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		String name= userService.getUserName(1L);
		mv.addObject("name",name);
        return mv;
	}

}
