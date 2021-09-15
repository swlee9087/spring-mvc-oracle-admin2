package shop.cofin.oracle.mappers;

//import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDTO;

@Repository
public interface OrderMapper extends GenericInterface<OrderDTO,Integer>{
	//public List<OrderDTO> findAll();
	//public OrderDTO findByOrderId(int orderId);
	public OrderDTO findByCustId(int custId);
	public OrderDTO findByBookId(int bookId);
	public OrderDTO findByOrderPrice(int orderPrice);
	public OrderDTO findByOrderDate(String orderDate);
	//void save(OrderDTO order);
}