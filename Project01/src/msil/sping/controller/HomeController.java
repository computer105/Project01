package msil.sping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("about");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("login");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("register");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView news(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("news");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
	@RequestMapping(value = "/usecase", method = RequestMethod.GET)
	public ModelAndView usecase(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("usecase");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
	@RequestMapping(value = "/forgot", method = RequestMethod.GET)
	public ModelAndView forgot(HttpSession session, HttpServletRequest resquest, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		ModelAndView model = new ModelAndView("forgot");
		try {
			return model;
		} catch (Exception e) {
			
		}
		return model;
	}
}
