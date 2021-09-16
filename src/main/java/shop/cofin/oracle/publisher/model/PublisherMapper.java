package shop.cofin.oracle.publisher.model;

//import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDTO,Integer>{
	
//	public List<PublisherDTO> findAll(); 
//	public PublisherDTO findByPubId(int pubId);
//	void save(PublisherDTO publisher);	
//	void update(PublisherDTO publisher);
//	void delete(int pubId);
	
	public PublisherDTO findByPubName(String pubName);
	public PublisherDTO findByMgrName(String mgrName);
	public PublisherDTO findByPhone(String phone);

	
}