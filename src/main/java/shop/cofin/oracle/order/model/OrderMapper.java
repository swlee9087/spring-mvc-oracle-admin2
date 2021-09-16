package shop.cofin.oracle.order.model;

//import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;

@Repository
public interface OrderMapper extends GenericInterface<OrderDTO,Integer>{
//	public List<OrderDTO> findAll();
//	public OrderDTO findByOrderId(int orderId);
//	void save(OrderDTO order);
//	void update(OrderDTO order);
//	void delete(int orderId);
	
	public OrderDTO findByCustId(int custId);
	public OrderDTO findByBookId(int bookId);
	public OrderDTO findByOrderPrice(int orderPrice);
	public OrderDTO findByOrderDate(String orderDate);
	
}