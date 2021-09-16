package shop.cofin.oracle.customer.model;

//import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDTO,Integer>{
//	public List<CustomerDTO> findAll();
//	public CustomerDTO findById(int custId); 
//	void save(CustomerDTO customer);
//	void update(CustomerDTO customer);  
//	void delete(int custId);
	
	public CustomerDTO findByCustName(String custName);
	public CustomerDTO findByAddress(String address);
	public CustomerDTO findByPhone(String phone);
	

}