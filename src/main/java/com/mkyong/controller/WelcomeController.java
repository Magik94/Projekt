package com.mkyong.controller;


import java.time.LocalDate;
import java.util.List;

import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import com.mkyong.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class WelcomeController {

	@Autowired
	private NoteService noteService;
	@Autowired
	private ExampleRepository exampleRepository;

	@RequestMapping(value = "/previusDay",method = RequestMethod.GET)
	public String welcome(Model model) {
		//noteService.addDay(1, "dodałem jeden dzień+13");
		model.addAttribute("findall",noteService.previusDays());
		System.out.println("1");
		return "welcome";
	}
	@RequestMapping(value = "/nextDay" ,method = RequestMethod.GET)
	public String nextDay(Model model){
		model.addAttribute("findall",noteService.nextDay());
		System.out.println("2");
		return "welcome";
	}
}

