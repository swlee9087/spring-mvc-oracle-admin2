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
	@RequestMapping(value="/customers", method = {RequestMethod.GET})
	public String customers() {
		return "customer/List";
	}
	@RequestMapping(value = "customer/register", method = {RequestMethod.GET})
	public String join() {
		return "customer/Register";
	}
	@RequestMapping(value="customer/login", method= {RequestMethod.GET})
	public String login() {
		return "customer/Login";
	}
	@RequestMapping(value="customer/update", method= {RequestMethod.GET})
	public String customerUpdate() {
		return "customer/Update";
	}
	@RequestMapping(value="customer/detail", method= {RequestMethod.GET})
	public String customerDetail() {
		return "customer/Detail";
	}
	
	
	/* books */
	@RequestMapping(value="/books", method = {RequestMethod.GET})
	public String books() {
		return "book/List";
	}
	@RequestMapping(value="book/add", method = {RequestMethod.GET})
	public String addBook() {
		return "book/Register";
	}
	@RequestMapping(value="book/update", method= {RequestMethod.GET})
	public String updateBook() {
		return "book/Update";
	}
	@RequestMapping(value="book/detail",method = {RequestMethod.GET})
	public String bookDetail() {
		return "book/Detail";
	}
	
	
	/* orders */
	@RequestMapping(value="/orders", method = {RequestMethod.GET})
	public String orders() {
		return "order/List";
	}
	@RequestMapping(value="order/add", method = {RequestMethod.GET})
	public String addOrder() {
		return "order/Register";
	}
	@RequestMapping(value="order/update", method= {RequestMethod.GET})
	public String updateOrder() {
		return "order/Update";
	}
	@RequestMapping(value="order/detail", method= {RequestMethod.GET})
	public String orderDetail() {
		return "order/Detail";
	}

	/* publishers */	
	@RequestMapping(value="/publishers",method = {RequestMethod.GET})
	public String publishers() {
		return "publisher/List";
	}
	@RequestMapping(value="publisher/add", method = {RequestMethod.GET})
	public String addPublisher() {
		return "publisher/Register";
	}
	@RequestMapping(value="publisher/update", method= {RequestMethod.GET})
	public String updatePublisher() {
		return "publisher/Update";
	}
	@RequestMapping(value="publisher/detail", method= {RequestMethod.GET})
	public String publisherDetail() {
		return "publisher/Detail";
	}
		
}