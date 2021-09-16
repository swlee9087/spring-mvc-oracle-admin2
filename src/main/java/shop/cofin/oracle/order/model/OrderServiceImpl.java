package shop.cofin.oracle.order.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired OrderMapper orderMapper;

	@Override
	public OrderDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO findByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderDTO findByCustId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO findByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO findByOrderPrice(int orderPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO findByOrderDate(String orderDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * @Override public List <OrderDTO> findAll(){ return orderMapper.findAll();}
	 * 
	 * @Override public OrderDTO findByOrderId(int orderId) { return
	 * orderMapper.findByOrderId(orderId);}
	 * 
	 * @Override public OrderDTO findByCustId(int custId) { return
	 * orderMapper.findByCustId(custId);}
	 * 
	 * @Override public OrderDTO findByBookId(int bookId) { return
	 * orderMapper.findByBookId(bookId);}
	 * 
	 * @Override public OrderDTO findByOrderPrice(int orderPrice) { return
	 * orderMapper.findByOrderPrice(orderPrice);}
	 * 
	 * @Override public OrderDTO findByOrderDate(String orderDate) { return
	 * orderMapper.findByOrderDate(orderDate);}
	 * 
	 * @Override public void save(OrderDTO order) { orderMapper.save(order); }
	 */
}