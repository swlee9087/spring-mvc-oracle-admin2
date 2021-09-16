package shop.cofin.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.model.BookDTO;
import shop.cofin.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDTO,Integer>{
	
	 public List<BookDTO> findAll();  
	 public BookDTO findById(int bookId); 
	 void save(BookDTO book);
	 void update(BookDTO book);
	 void delete(int orderId); 	 

	 public	BookDTO findByPubId(int pubId); 
	 public BookDTO findByBookTitle(String bookTitle); 
	 public BookDTO findByPrice(int price); 
}