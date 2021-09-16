package shop.cofin.oracle.publisher.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.GenericInterface;

@Component
public interface PublisherService extends GenericInterface<PublisherDTO,Integer> {
	public List<PublisherDTO> findAll();
	public PublisherDTO findByPubId(int pubId);
	void save(PublisherDTO publisher);
	void update(PublisherDTO publisher);  //overriding
	void delete(int pubId);
	
	public PublisherDTO findByPubName(String pubName); 
	public PublisherDTO findByMgrName(String mgrName); 
	public PublisherDTO findByPhone(String phone);
	
	
}