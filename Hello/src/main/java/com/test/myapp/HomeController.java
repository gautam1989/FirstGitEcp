package com.test.myapp;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Person;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		return "home";
	}
	
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	public String getAllPersons(Model model){
		
		Person p1=new Person();
		p1.setAge(10);p1.setName("gautam");
		Person p2=new Person();
		p2.setAge(20);p2.setName("sani");
		
		List<Person>personList=new ArrayList<Person>();
		personList.add(p1);personList.add(p2);
//		ModelAndView modelAndView = new ModelAndView("personList");
//       modelAndView.addObject("home",personList);
		System.out.println(personList);
	   model.addAttribute("personList",personList);
       return "home";
	}
	
}
