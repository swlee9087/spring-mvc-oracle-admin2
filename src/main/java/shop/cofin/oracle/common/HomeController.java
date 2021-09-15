package shop.cofin.oracle.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	
	
	/* customers */
	@RequestMapping(value="/customers", method = RequestMethod.GET)
	public String customers() {
		return "/customer/List";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "customer/Join";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "customer/Login";
	}
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String customerUpdate() {
		return "/customer/Update";
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String customerDetail() {
		return "/customer/Detail";
	}
	
	/* books */
	@RequestMapping(value="/books", method = RequestMethod.GET)
	public String books() {
		return "/book/List";
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addBook() {
		return "book/Add";
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String bookDetail() {
		return
	}
	
	/* orders */
	@RequestMapping(value="/orders", method = RequestMethod.GET)
	public String orders() {
		return "/orders";
	}
	@RequestMapping(value="/neworder", method=RequestMethod.GET)
	public String newOrder() {
		return "order/NewOrder";
	}

	/* publishers */	
	@RequestMapping(value="/publishers", method = RequestMethod.GET)
	public String publishers() {
		return "/publishers";
	}
	@RequestMapping(value="/newpublisher", method=RequestMethod.GET)
	public String newPublisher() {
		return "publisher/NewPublisher";
	}
		
}