package com.mkyong;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

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

		ExampleDocument osoba = new ExampleDocument(new Date(24 , 10 ,2017),"tedada");
		exampleRepository.insert(osoba);
		List<ExampleDocument> all = exampleRepository.findAll();
		model.addAttribute("examples",all);
		return "notes";
	}


}

