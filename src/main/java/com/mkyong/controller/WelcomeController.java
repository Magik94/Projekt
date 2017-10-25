package com.mkyong.controller;


import java.util.List;

import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import com.mkyong.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class WelcomeController {

	@Autowired
	private NoteService noteService;
	@Autowired
	private ExampleRepository exampleRepository;


	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/notes")

	public String notes(Model model){
//		ExampleNote note = new ExampleNote("25.10.2017", "yeee");
//		exampleRepository.insert(note);
//		List<ExampleNote> all = exampleRepository.findAll();
//		model.addAttribute("example",all);
//		return "notes";

		noteService.upload(new Date(),"d");
		List<DayDocument> all = exampleRepository.findAll();
		model.addAttribute("examples",all);
		return "notes";
	}


}

