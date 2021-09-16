package shop.cofin.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.model.OrderDTO;

@Repository
public interface OrderMapper extends GenericInterface<OrderDTO,Integer>{
	public List<OrderDTO> findAll();
	public OrderDTO findById(int orderId);
	void save(OrderDTO order);
	void update(OrderDTO order);
	void delete(int orderId);
	
	public OrderDTO findByCustId(int custId);
	public OrderDTO findByBookId(int bookId);
	public OrderDTO findByOrderPrice(int orderPrice);
	public OrderDTO findByOrderDate(String orderDate);
	
}