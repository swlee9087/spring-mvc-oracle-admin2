package shop.cofin.oracle.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.book.service.BookService;

@Controller @RequestMapping("/books")
public class BookController {

	@Autowired BookService bookService;
	@Autowired BookDTO book;
	
	@RequestMapping (value="/book/new", method= {RequestMethod.GET})
	public String newbook(
			@RequestParam("bookId") int bookId,
			@RequestParam("bookTitle") String bookTitle,
			@RequestParam("price") int price,
			@RequestParam("pubId") int pubId) {
		System.out.println("bookId: "+bookId);
		System.out.println("bookTitle: "+bookTitle);
		System.out.println("price: "+price);
		System.out.println("pubId: "+pubId);	
		book=new BookDTO();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setPrice(price);
		book.setPubId(pubId);
		bookService.save(book);
		return "New Book Saved!";
	}
	
	public void findAll() {
		List<BookDTO> books = bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping("/books/bookId/{bookId}")
	public void findById (@PathVariable int bookId) {
		BookDTO books = bookService.findById(bookId);
		System.out.println(books.toString());
	}
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId (@PathVariable int pubId) {
		BookDTO books = bookService.findByPubId(pubId);
		System.out.println(books.toString());
	}
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByBookTitle (@PathVariable String bookTitle) {
		BookDTO books = bookService.findByBookTitle(bookTitle);
		System.out.println(books.toString());
	}
	@RequestMapping("/books/price/{price}")
	public void findByPrice (@PathVariable int price) {
		BookDTO books = bookService.findByPrice(price);
		System.out.println(books.toString());
	}
}