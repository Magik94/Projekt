package com.mkyong.controller;


import java.time.LocalDate;
import java.util.List;

import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import com.mkyong.Service.NoteService;
import javax.websocket.server.PathParam;
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

	@RequestMapping
	public String start(Model model){
		DayDocument currentDate = noteService.getCurrentDate();
		model.addAttribute("day",currentDate);
		return "welcome";
	}


	@RequestMapping(value = "/nextDay" ,method = RequestMethod.GET)
	public String nextDay(Model model,@RequestParam("nextDate") String nextDate){
		model.addAttribute("day",noteService.nextDay(nextDate));
		return "welcome";
	}
}

