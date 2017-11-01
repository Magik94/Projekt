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

	@RequestMapping("/")
	public String welcome(Model model ,DayDocument dayDocument) {
		//exampleRepository.findByAllDocumentLocalDate("d").forEach(System.out::println);
		//exampleRepository.findByDayDocumentLocalDate(LocalDate.of(2017,11,01)).forEach(System.out::println);
		List<DayDocument> searchDate = exampleRepository.findByDayDocumentLocalDate(LocalDate.of(2017,11,01));
		model.addAttribute("findall",searchDate);
		return "welcome";
	}

	@RequestMapping("/notes")
	public String notes(Model model){
		//noteService.upload(new Date(),"d");
		noteService.addDay(1, "dobrze");
		List<DayDocument> all = exampleRepository.findAll();
		model.addAttribute("examples",all); //odpowiada za wyświetlenie na stronie www
		return "notes";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchDaysAndNotes(@RequestParam(value = "cn",required = false) String cn){
		ModelAndView modelAndView = new ModelAndView("search","command", new DayDocument());
		//exampleRepository.findByAllDocumentLocalDate("d").forEach(System.out::println);
		System.out.println(cn+"wez");
		return modelAndView;

}
	}

