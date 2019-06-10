package msil.sping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("home");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
	public ModelAndView about(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("about");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
}
