package shop.cofin.oracle.mappers;

//import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.publisher.domain.PublisherDTO;

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