package com.ravi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ravi.model.Person;

@Controller
public class MessageController {

	@GetMapping("/msg")
	public ModelAndView getWellcomeMessage() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to first web appliction");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/book")
	public ModelAndView getBookData() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("id","101");
		mav.addObject("name","C++");
		mav.addObject("price","500");
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/greet")
	public String getGreetMessage(Model model) {
		model.addAttribute("msg", "Good Morning...");
		return "index";
	}
	
	@GetMapping("/person-data")
	public String getPersonData(Model model) {
		
		Person p = new Person(101, "Ravi", 23);
		
		model.addAttribute("person",p);
		return "index";
	}
	
	@GetMapping("/persons/{id}/{name}")
	public String getPersonDetails(
//			@RequestParam("course")String course, 
//			@RequestParam("price")String price,
			@PathVariable("id") String id,
			@PathVariable("name")String name,
			Model model) {
		
		System.out.println("Person Id ::"+id);
		System.out.println("Person Name ::"+name);
//		System.out.println("Course Name ::"+course);
//		System.out.println("Course Price ::"+price);
		
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person(101, "Ravi", 23));
		personList.add(new Person(102, "Sohan", 25));
		personList.add(new Person(103, "Moahn", 20));
		personList.add(new Person(104, "Suraj", 23));
		personList.add(new Person(105, "Deeapk", 25));
		
		
		model.addAttribute("persons",personList);
		
		return "index";
	}
}
