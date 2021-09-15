package shop.cofin.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.publisher.domain.PublisherDTO;
import shop.cofin.oracle.publisher.service.PublisherService;
//import shop.cofin.oracle.common.GenericInterface;

@Controller 
public class PublisherController{
	
	@Autowired PublisherService publisherService;
	@Autowired PublisherDTO publisher;
	@RequestMapping("/list")
	public List<PublisherDTO> findAll() {
		return publisherService.findAll();
	}
	@RequestMapping("/find/{pubId}")
	public PublisherDTO findById(int pubId) {
		return publisherService.findById(pubId);
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public void update(PublisherDTO publisher) {
		publisherService.update(publisher);
	}
	@RequestMapping(value="/delete/{pubId}",method=RequestMethod.POST)
	public void delete(int pubId) {
		publisherService.delete(pubId);
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(PublisherDTO publisher) {
		publisherService.save(publisher);
	}
	
	
	
}
