package shop.cofin.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
/*import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.book.service.BookService;
//import shop.cofin.oracle.common.GenericInterface;

@Controller

public class BookController{

	@Autowired	BookService bookService;
	@Autowired	BookDTO book;
	@RequestMapping("/list")
	public List<BookDTO> findAll() {
		return bookService.findAll();
	}
	@RequestMapping("/find/{bookId}")
	public BookDTO findById(int bookId) {
		return bookService.findById(bookId);
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(BookDTO book) {
		bookService.update(book);
	}
	@RequestMapping(value="/delete/{bookId}", method=RequestMethod.POST)
	public void delete(int bookId) {
		bookService.delete(bookId);
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(BookDTO book) {
		bookService.save(book);
		
	}

	

}