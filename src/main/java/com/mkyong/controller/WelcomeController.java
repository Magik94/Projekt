package com.mkyong.controller;


import java.time.LocalDate;
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
	public String welcome(Model model) {
		exampleRepository.findByDayDocumentLocalDate("d").forEach(System.out::println);
		//
//		List<DayDocument> question = exampleRepository.findByDayDocumentLocalDate("d");
//		model.addAttribute("examples",question);
		//System.out.println(question+ "tutaj");
		return "welcome";
	}

	@RequestMapping("/notes")
	public String notes(Model model){
		//noteService.upload(new Date(),"d");
		noteService.addDay(1, "d");
		List<DayDocument> all = exampleRepository.findAll();
		model.addAttribute("examples",all); //odpowiada za wyświetlenie na stronie www

		return "notes";
	}


}

