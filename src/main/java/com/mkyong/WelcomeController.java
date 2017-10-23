package com.mkyong;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

	@Autowired
	private ExampleRepository exampleRepository;

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello Worldxd";

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/notes")
	public String notes(Model model){
		ExampleDocument osoba = new ExampleDocument("Osoba", 4l);
		exampleRepository.insert(osoba);
		List<ExampleDocument> all = exampleRepository.findAll();
		model.addAttribute("examples",all);
		return "notes";
	}


}

