package team.projectA.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value="/lodging") //공통적인 url을 Controller 위에서 실행
@Controller
public class LodgingController {
	
	private static final Logger logger = LoggerFactory.getLogger(LodgingController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/lodgingView.do", method = RequestMethod.GET)
	public String lodgingView(Locale locale, Model model) {
		
		return "lodging/lodgingView";
	}
	
}
