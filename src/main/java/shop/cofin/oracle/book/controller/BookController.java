package shop.cofin.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
/*import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.book.service.BookService;
//import shop.cofin.oracle.common.GenericInterface;

@Controller
@RequestMapping("/books")
public class BookController{

	@Autowired	BookService bookService;
	@Autowired	BookDTO book;
	
	@RequestMapping("/list")
	public void findAll() {
		List<BookDTO> books= bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping(value="/find/{bookId}", method=RequestMethod.GET)
	public BookDTO findById(@PathVariable("bookid")int bookId) {
		return bookService.findById(bookId);
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(BookDTO book) {
		bookService.update(book);
		return " Updated.";
	}
	@RequestMapping(value="/delete/{bookId}", method=RequestMethod.POST)
	public String delete(int bookId) {
		bookService.delete(bookId);
		return " Deleted.";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(BookDTO book) {
		bookService.save(book);
		return " Saved!";
		
	}
	@RequestMapping(value="/findByPubId/{pubId}", method=RequestMethod.GET)
	public void findByPubId(@PathVariable("pubId") int pubId) {
		bookService.findByPubId(pubId);
		System.out.println(pubId+" Found.");
	}
	
	@RequestMapping(value="/findByBookTitle/{bookTitle}", method=RequestMethod.GET)
	public void findByBookTitle(@PathVariable("bookTitle")String bookTitle) {
		bookService.findByBookTitle(bookTitle);
		System.out.println(bookTitle+" Found.");
	}
	
	@RequestMapping(value="/findByPrice/{price}", method=RequestMethod.GET)
	public void findByPrice(@PathVariable("price")int price) {
		bookService.findByPrice(price);
		System.out.println(price+" Found.");
	}
}