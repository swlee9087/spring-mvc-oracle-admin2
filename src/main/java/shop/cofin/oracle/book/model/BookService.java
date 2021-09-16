package shop.cofin.oracle.book.model;

//import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDTO,Integer>{
//	
//	public List<BookDTO> findAll();
//	public BookDTO findById(int bookId);
//	void save(BookDTO book);
//	void update(BookDTO book);  //overriding
//	void delete(int bookId);
	
	public BookDTO findByPubId(int pubId);
	public BookDTO findByBookTitle(String bookTitle);
	public BookDTO findByPrice(int price);
	
	
}