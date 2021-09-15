package shop.cofin.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.cofin.oracle.order.domain.OrderDTO;
import shop.cofin.oracle.order.service.OrderService;

//import shop.cofin.oracle.common.GenericInterface;

@Controller @RequestMapping("/orders")
public class OrderController{
	@Autowired OrderService orderService;
	@Autowired OrderDTO order;
	
	@RequestMapping("/list")
	public void findAll() {
		List<OrderDTO> orders=orderService.findAll();
		for (OrderDTO order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping(value="/detail", method= {RequestMethod.GET})
	public OrderDTO findById(@PathVariable("orderId")int orderId) {
		return orderService.findByOrderId(orderId);
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(OrderDTO order) {
		orderService.update(order);
		return " Updated.";
	}
	@RequestMapping(value="/delete/{orderId}", method=RequestMethod.POST)
	public String delete(int orderId) {
		orderService.delete(orderId);	
		return "Deleted.";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(OrderDTO order) {
		orderService.save(order);		
		return " Saved!";
	}
	@RequestMapping (value="/findByCustId/{custId}", method=RequestMethod.GET)
	public void findByCustId(@PathVariable("custId")int custId) {
		orderService.findByCustId(custId);
		System.out.print(custId);
	}
	@RequestMapping(value="/findByBookId/{bookId}", method=RequestMethod.GET)
	public void findByBookId(@PathVariable("bookId")int bookId) {
		orderService.findByBookId(bookId);
		System.out.print(bookId);
	}
	@RequestMapping(value="/findByOrderPrice/{orderPrice}", method=RequestMethod.GET)
	public void findByOrderPrice(@PathVariable("orderPrice")int orderPrice) {
		orderService.findByOrderPrice(orderPrice);
		System.out.print(orderPrice);
	}
	@RequestMapping(value="/findByOrderDate/{orderDate}",method=RequestMethod.GET)
	public void findByOrderDate(@PathVariable("orderDate")String orderDate) {
		orderService.findByOrderDate(orderDate);
		System.out.print(orderDate);
	}

	
	/*
	 * @RequestMapping (value="/order/new", method= {RequestMethod.GET}) public
	 * String newOrder(
	 * 
	 * @PathVariable("orderId") int orderId,
	 * 
	 * @PathVariable("custId") int custId,
	 * 
	 * @PathVariable("bookId") int bookId,
	 * 
	 * @PathVariable("orderPrice") int orderPrice,
	 * 
	 * @PathVariable("orderDate") String orderDate ) {
	 * System.out.println("orderId: "+orderId);
	 * System.out.println("custId: "+custId); System.out.println("bookId: "+bookId);
	 * System.out.println("orderPrice: "+orderPrice);
	 * System.out.println("orderDate: "+orderDate); order=new OrderDTO();
	 * order.setOrderId(orderId); order.setCustId(custId); order.setBookId(bookId);
	 * order.setOrderPrice(orderPrice); order.setOrderDate(orderDate);
	 * orderService.save(order); return "New Order Registered!"; }
	 * 
	 * 
	 * public void findAll() { List<OrderDTO> orders = orderService.findAll();
	 * for(OrderDTO order : orders) { System.out.println(order.toString()); } }
	 * 
	 * @RequestMapping("/orders/orderId/{orderId}") public void
	 * findByOrderId(@PathVariable int orderId) { OrderDTO orders =
	 * orderService.findByOrderId(orderId); System.out.println(orders.toString()); }
	 * 
	 * @RequestMapping("/orders/custId/{custId}") public void
	 * findByCustId(@PathVariable int custId) { OrderDTO orders =
	 * orderService.findByCustId(custId); System.out.println(orders.toString()); }
	 * 
	 * @RequestMapping("/orders/bookId/{bookId}") public void
	 * findByBookId(@PathVariable int bookId) { OrderDTO orders =
	 * orderService.findByBookId(bookId); System.out.println(orders.toString()); }
	 * 
	 * @RequestMapping("/orders/orderPrice/{orderPrice}") public void
	 * findByOrderPrice(@PathVariable int orderPrice) { OrderDTO orders =
	 * orderService.findByOrderPrice(orderPrice);
	 * System.out.println(orders.toString()); }
	 * 
	 * @RequestMapping("/orders/orderDate/{orderDate}") public void
	 * findByOrderDate(@PathVariable String orderDate) { OrderDTO orders =
	 * orderService.findByOrderDate(orderDate);
	 * System.out.println(orders.toString()); }
	 */
}