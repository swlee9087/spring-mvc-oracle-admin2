package shop.cofin.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDTO;

@Component
public interface CustomerService extends GenericInterface<CustomerDTO,Integer> {
	public List<CustomerDTO> findAll();
	public CustomerDTO findById(int custId);
	void save(CustomerDTO customer);
	void update(CustomerDTO customer);  
	void delete(int custId);
	
	public CustomerDTO findByCustName(String custName);
	public CustomerDTO findByAddress(String address);
	public CustomerDTO findByPhone(String phone);
	
}