package shop.cofin.oracle.customer.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper mapper;

	@Override
	public CustomerDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO findById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int custId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDTO findByCustName(String custName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO findByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public List<CustomerDTO> findAll() { return mapper.findAll(); }
	 * 
	 * @Override public CustomerDTO findById(int custId) { return
	 * mapper.findById(custId); }
	 * 
	 * @Override public void update(CustomerDTO customer) { mapper.update(customer);
	 * }
	 * 
	 * @Override public void delete(int custId) { mapper.delete(custId); }
	 * 
	 * @Override public void save(CustomerDTO customer) { mapper.save(customer); }
	 * 
	 * 
	 * @Override public CustomerDTO findByCustName(String custName) { return
	 * mapper.findByCustName(custName); }
	 * 
	 * @Override public CustomerDTO findByAddress(String address) { return
	 * mapper.findByAddress(address); }
	 * 
	 * @Override public CustomerDTO findByPhone(String phone) { return
	 * mapper.findByPhone(phone); }
	 */
	
	/*
	 * @Override public List<CustomerDTO> findAll(){ return
	 * customerMapper.findAll(); }
	 * 
	 * @Override public CustomerDTO findById(int custId) { return
	 * customerMapper.findById(custId); };
	 * 
	 * public CustomerDTO findByCustName(String custName) { return
	 * customerMapper.findByCustName(custName); };
	 * 
	 * public CustomerDTO findByAddress(String address) { return
	 * customerMapper.findByAddress(address); };
	 * 
	 * public CustomerDTO findByPhone(String phone) { return
	 * customerMapper.findByPhone(phone); }
	 */
	
}