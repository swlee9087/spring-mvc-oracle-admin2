package shop.cofin.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.publisher.domain.PublisherDTO;
import shop.cofin.oracle.publisher.service.PublisherService;
//import shop.cofin.oracle.common.GenericInterface;

@Controller @RequestMapping("/publishers")
public class PublisherController{
	
	@Autowired PublisherService publisherService;
	@Autowired PublisherDTO publisher;
	
	@RequestMapping("/	")
	public void findAll() {
		List<PublisherDTO> publishers= publisherService.findAll();
		for(PublisherDTO publisher: publishers) {
			System.out.println(publisher.toString());
		}
	}
	@RequestMapping("/find/{pubId}")
	public PublisherDTO findById(@PathVariable("pubId") int pubId) {
		return publisherService.findById(pubId);
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(PublisherDTO publisher) {
		publisherService.update(publisher);
		return "Updated.";
	}
	@RequestMapping("/delete/{pubId}")
	public String delete(int pubId) {
		publisherService.delete(pubId);
		return "Deleted.";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String save(PublisherDTO publisher) {
		publisherService.save(publisher);
		return "Registered.";
	}
	
	@RequestMapping(value="/findByPubName/{pubName}",method=RequestMethod.GET)
	public void findByPubName(@PathVariable("pubName") String pubName) {
		publisherService.findByPubName(pubName);
		System.out.println(pubName);
	}
	@RequestMapping(value="/findByMgrName/{mgrName}",method=RequestMethod.GET)
	public void findByMgrName(@PathVariable("mgrName") String mgrName) {
		publisherService.findByMgrName(mgrName);
		System.out.println(mgrName);
	}
	@RequestMapping(value="/findByPhone/{phone}",method=RequestMethod.GET)
	public void findByPhone(@PathVariable("phone") String phone) {
		publisherService.findByPhone(phone);
		System.out.println(phone);
	}
}
