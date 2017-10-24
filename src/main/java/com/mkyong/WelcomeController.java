package com.mkyong;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.logging.Logger;

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

		ExampleDocument osoba = new ExampleDocument(new Date(),"tedada");
		Logger logger = Logger.getLogger(this.getClass().getName()) ;
		logger.info("traaaa   "+osoba.getDate());
		exampleRepository.insert(osoba);
		logger.info("traaaa  1   "+osoba.getDate());
		List<ExampleDocument> all = exampleRepository.findAll();
		logger.info("traaaa  2 "+osoba.getDate());
		model.addAttribute("examples",all);
		logger.info("traaaa  4 "+osoba.getDate());
		return "notes";
	}


}

