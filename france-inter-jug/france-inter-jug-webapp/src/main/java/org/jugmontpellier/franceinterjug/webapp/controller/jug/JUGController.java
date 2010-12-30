package org.jugmontpellier.franceinterjug.webapp.controller.jug;

import java.util.List;

import javax.inject.Inject;

import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.dao.JugDAO;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jug")
public class JUGController {

	@Inject
	private JugDAO jugDAO;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("jug/jug-list");
		
		List<Jug> list = jugDAO.getAll();
		
		modelAndView.addObject("list", list);
		
		return modelAndView;
	}
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") int id, Model model) {
		ModelAndView modelAndView = new ModelAndView("jug/jug-edit");
		
		Jug jug = jugDAO.read(id);
		
		modelAndView.addObject("jug", jug);
		
		model.addAttribute(jug);
		
		return modelAndView;
	}
	
	@Transactional
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView post(@PathVariable("id") int id, Jug jug2, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("jug/jug-edit");
		
		Jug jug = jugDAO.read(id);
		
		jug.setName(jug2.getName());
		
		
		return modelAndView;
	}
	
}
