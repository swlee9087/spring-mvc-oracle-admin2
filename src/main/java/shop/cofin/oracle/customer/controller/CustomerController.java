package shop.cofin.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

//import jdk.internal.module.ModuleLoaderMap.Mapper;
//import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDTO;
import shop.cofin.oracle.customer.service.CustomerService;

@Controller 
public class CustomerController{
	@Autowired CustomerService customerService;
	@Autowired CustomerDTO customer;
	@RequestMapping("/list")
	public List<CustomerDTO> findAll() {
		return customerService.findAll();
	}
	@RequestMapping("/find/{custId}")
	public CustomerDTO findById(int custId) {
		return customerService.findById(custId);
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(CustomerDTO customer) {
		customerService.update(customer);		
	}
	@RequestMapping(value="/delete/{custId}", method=RequestMethod.POST)
	public void delete(int custId) {
		customerService.delete(custId);		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(CustomerDTO customer) {
		customerService.save(customer);		
	}
	
	
	
	
	
	
	/*
	 * @RequestMapping("/customers") public void findAll() { List<CustomerDTO>
	 * customers = customerService.findAll(); for(CustomerDTO customer : customers)
	 * { System.out.println(customer.toString()); } }
	 * 
	 * public void findById (@PathVariable int custId) { List<CustomerDTO> customers
	 * = null; }
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
	 * 
	 * @RequestMapping (value="/customer/join", method= {RequestMethod.GET}) public
	 * String join(
	 * 
	 * @RequestParam("custId") int custId,
	 * 
	 * @RequestParam("custName") String custName,
	 * 
	 * @RequestParam("address")String address,
	 * 
	 * @RequestParam("phone") String phone) { System.out.println("custId: "+custId);
	 * System.out.println("custName: "+custName);
	 * System.out.println("address: "+address); System.out.println("phone: "+phone);
	 * customer=new CustomerDTO(); customer.setCustId(custId);
	 * customer.setAddress(address); customer.setCustName(custName);
	 * customer.setPhone(phone); customerService.save(customer); return
	 * "Join Success!"; }
	 * 
	 * @RequestMapping (value="/customer/login", method= {RequestMethod.POST})
	 * public String login() { return "Login Success!"; }
	 */
	
}