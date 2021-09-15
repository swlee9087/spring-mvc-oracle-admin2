package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDTO;

@Component
public interface OrderService extends GenericInterface<OrderDTO,Integer>{
	public List<OrderDTO> findAll();
	public OrderDTO findByOrderId(int orderId);
	void update(OrderDTO order);  //overriding
	void delete(int orderId);
	void save(OrderDTO order);  //C
		
	public OrderDTO findByCustId(int custId);
	public OrderDTO findByBookId(int bookId);
	public OrderDTO findByOrderPrice(int orderPrice);
	public OrderDTO findByOrderDate(String orderDate);
	

}