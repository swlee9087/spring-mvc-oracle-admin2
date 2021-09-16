package shop.cofin.oracle.book.model;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class BookServiceImpl implements BookService{
	@Autowired BookMapper mapper;

	@Override
	public List<BookDTO> findAll() {
		return mapper.findAll();
	}

	@Override
	public BookDTO findById(int bookId) {
		return mapper.findById(bookId);
	}

	@Override
	public void save(BookDTO book) {
		mapper.save(book);
	}

	@Override
	public void update(BookDTO book) {
		mapper.update(book);
	}

	@Override
	public void delete(int bookId) {
		mapper.delete(bookId);
	}

	@Override
	public BookDTO findByPubId(int pubId) {
		return mapper.findByPubId(pubId);
	}

	@Override
	public BookDTO findByBookTitle(String bookTitle) {
		return mapper.findByBookTitle(bookTitle);
	}

	@Override
	public BookDTO findByPrice(int price) {
		return mapper.findByPrice(price);
	}

	@Override
	public BookDTO findById(Integer id) {
		return mapper.findById(id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);;
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