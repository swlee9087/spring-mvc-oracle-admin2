package shop.cofin.oracle.book.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.mappers.BookMapper;

@Service 
public class BookServiceImpl implements BookService{
	@Autowired BookMapper mapper;

	@Override
	public BookDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO findById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(BookDTO book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookDTO book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookDTO findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO findByBookTitle(String bookTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO findByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	/*
	 * @Override public List<BookDTO> findAll() { return mapper.findAll(); }
	 * 
	 * @Override public BookDTO findById(int bookId) { return
	 * mapper.findById(bookId); }
	 * 
	 * @Override public void save(BookDTO book) { mapper.save(book); }
	 * 
	 * @Override public void update(BookDTO book) { mapper.update(book); }
	 * 
	 * @Override public void delete(int bookId) { mapper.delete(bookId); }
	 * 
	 * @Override public BookDTO findByPubId(int pubId) { return
	 * mapper.findByPubId(pubId); }
	 * 
	 * @Override public BookDTO findByBookTitle(String bookTitle) { return
	 * mapper.findByBookTitle(bookTitle); }
	 * 
	 * @Override public BookDTO findByPrice(int price) { return
	 * mapper.findByPrice(price); }
	 */
	
}