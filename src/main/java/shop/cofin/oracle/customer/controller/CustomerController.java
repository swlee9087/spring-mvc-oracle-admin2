package shop.cofin.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.cofin.oracle.customer.domain.CustomerDTO;
import shop.cofin.oracle.customer.service.CustomerService;


@Controller @RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired CustomerDTO customer;
	
	@RequestMapping("/list")
	public void findAll() {
		List<CustomerDTO> customers = customerService.findAll();
		for(CustomerDTO customer : customers) {
			System.out.println(customer.toString());
		}
	}
	@RequestMapping(value="/find/{custId}", method= {RequestMethod.GET})
	public CustomerDTO findById(@PathVariable("custId") int custId) {
		return customerService.findById(custId);
	}
	@RequestMapping(value="/update", method= {RequestMethod.POST})
	public String update(CustomerDTO customer) {
		customerService.update(customer);
		return "Updated.";
	}
	@RequestMapping(value="/delete/{custId}",method=RequestMethod.POST)
	public String delete(int custId) {
		customerService.delete(custId);
		return "Deleted.";
	}
	@RequestMapping(value="/register", method= {RequestMethod.POST})
	public String save(CustomerDTO customer) {
		customerService.save(customer);
		return " Registered!";
	}
	
	@RequestMapping(value="/findByCustName/{custName}", method= {RequestMethod.GET})
	public void findByCustName(@PathVariable("custName")String custName) {
		customerService.findByCustName(custName);
		System.out.print(custName);
	}
	@RequestMapping(value="/findByAddress/{address}",method= {RequestMethod.GET})
	public void findByAddress(@PathVariable("address")String address) {
		customerService.findByAddress(address);
		System.out.print(address);
	}	
	@RequestMapping(value="/findByPhone/{phone}",method= {RequestMethod.GET})
	public void findByPhone(@PathVariable("phone")String phone) {
		customerService.findByPhone(phone);
		System.out.print(phone);
	}
	
	/*
	 * @RequestMapping (value="/customer/join", method= {RequestMethod.GET}) public
	 * String join(
	 * 
	 * @PathVariable("custId") int custId,
	 * 
	 * @PathVariable("custName") String custName,
	 * 
	 * @PathVariable("address")String address,
	 * 
	 * @PathVariable("phone") String phone ) {
	 * System.out.println("custId: "+custId);
	 * System.out.println("custName: "+custName);
	 * System.out.println("address: "+address); System.out.println("phone: "+phone);
	 * customer=new CustomerDTO(); customer.setCustId(custId);
	 * customer.setAddress(address); customer.setCustName(custName);
	 * customer.setPhone(phone); customerService.save(customer); return
	 * "Join Success!"; }
	 */
	  
	/*
	 * @RequestMapping("/list") public List<CustomerDTO> findAll() { return
	 * customerService.findAll(); }
	 * 
	 * @RequestMapping("/find/{custId}") public CustomerDTO findById(int custId) {
	 * return customerService.findById(custId); }
	 * 
	 * @RequestMapping(value="/update", method=RequestMethod.POST) public void
	 * update(CustomerDTO customer) { customerService.update(customer); }
	 * 
	 * @RequestMapping(value="/delete/{custId}", method=RequestMethod.POST) public
	 * void delete(int custId) { customerService.delete(custId); }
	 * 
	 * @RequestMapping(value="/save", method=RequestMethod.POST) public void
	 * save(CustomerDTO customer) { customerService.save(customer); }
	 * 
	 * 
	 * @RequestMapping (value="/customer/login", method= {RequestMethod.POST})
	 * public String login() { return "Login Success!"; }
	 * 
	 * @RequestMapping (value="/customer/register", method= {RequestMethod.POST})
	 * public String register() {return "Register Success!";}
	 */
	
	
	/*
	 * @RequestMapping("/customers") public void findAll() { List<CustomerDTO>
	 * customers = customerService.findAll(); for(CustomerDTO customer : customers)
	 * { System.out.println(customer.toString()); } }
	 * 

	 * 
	 * @RequestMapping("/customers/custName/{custName}") public void findByCustName
	 * (@PathVariable String custName) { List<CustomerDTO> customers = null; }
	 * 
	 * @RequestMapping("/customers/address/{address}") public void findByAddress
	 * (@PathVariable String address) { List<CustomerDTO> customers = null; }
	 * 
	 * @RequestMapping("/customers/phone/{phone}") public void findByPhone
	 * (@PathVariable String phone) { List<CustomerDTO> customers = null; }
	 * 
	 * @RequestMapping("/customers/custId/{custId}") public CustomerDTO
	 * findById(String id) { // TODO Auto-generated method stub return null; }
	 */ 
	 
	
}