package org.jugmontpellier.franceinterjug.webapp.controller.jug;

import java.util.List;

import javax.inject.Inject;

import org.jugmontpellier.franceinterjug.store.Jug;
import org.jugmontpellier.franceinterjug.store.dao.JugDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
