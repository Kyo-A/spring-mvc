package com.example.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.repositories.PersonneRepository;

@Controller
public class HomeController {

	@Autowired
	private PersonneRepository personneRepository;

	// @RequestMapping(value="/", method = RequestMethod.GET)
	@GetMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	// http://localhost:8080/spring-mvc/hello?nom=Bob
	@GetMapping(value = "/hello")
	public ModelAndView hello(@RequestParam(value = "nom") String nom) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("nom", nom);
		mv.setViewName("home");
		return mv;
	}

	// http://localhost:8080/spring-mvc/home/Bob
	@GetMapping(value = "/home/{nom}")
	public String hello2(@PathVariable(value = "nom") String nom, ModelMap modelMap) {
		modelMap.addAttribute("nom", nom);
		return "home";
	}

	// http://localhost:8080/spring-mvc/showAll
	@GetMapping(value = "/showAll")
	public ModelAndView showAll() {	
		ModelAndView mv = new ModelAndView();
		mv.addObject("personnes", personneRepository.findAll());
		mv.setViewName("home");
		return mv;
	}
	
}
