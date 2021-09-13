package shop.cofin.oracle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String join() {
		return "customer/Join";
	}
	@RequestMapping(value="/loginform", method=RequestMethod.GET)
	public String login() {
		return "customer/Login";
	}
	@RequestMapping(value="/newbook", method=RequestMethod.GET)
	public String newBook() {
		return "book/NewBook";
	}
	@RequestMapping(value="/neworder", method=RequestMethod.GET)
	public String newOrder() {
		return "order/NewOrder";
	}
	@RequestMapping(value="/newpublisher", method=RequestMethod.GET)
	public String newPublisher() {
		return "publisher/NewPublisher";
	}
		
}