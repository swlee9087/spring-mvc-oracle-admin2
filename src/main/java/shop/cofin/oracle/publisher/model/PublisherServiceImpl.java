package shop.cofin.oracle.publisher.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.common.mapper.PublisherMapper;

@Service
public class PublisherServiceImpl implements PublisherService{
	@Autowired PublisherMapper publisherMapper;

	@Override
	public PublisherDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PublisherDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublisherDTO findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(PublisherDTO publisher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PublisherDTO publisher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int pubId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PublisherDTO findByPubName(String pubName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublisherDTO findByMgrName(String mgrName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublisherDTO findByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	/*
	 * @Override public List<PublisherDTO> findAll(){ return
	 * publisherMapper.findAll(); }
	 * 
	 * @Override public PublisherDTO findByPubId(int pubId) { return
	 * publisherMapper.findByPubId(pubId); };
	 * 
	 * @Override public PublisherDTO findByPubName(String pubName) { return
	 * publisherMapper.findByPubName(pubName); };
	 * 
	 * @Override public PublisherDTO findByMgrName(String mgrName) { return
	 * publisherMapper.findByMgrName(mgrName); };
	 * 
	 * @Override public PublisherDTO findByPhone(String phone) { return
	 * publisherMapper.findByPhone(phone); }
	 * 
	 * @Override public void save(PublisherDTO publisher) {
	 * publisherMapper.save(publisher); };
	 */
}