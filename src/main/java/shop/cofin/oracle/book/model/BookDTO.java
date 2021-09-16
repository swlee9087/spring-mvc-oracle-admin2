package shop.cofin.oracle.book.model;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class BookDTO {
	private int bookId;
	private String bookTitle;
	private int price;
	private int pubId;
	
	public int getBookId() {
		return bookId;
	}	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	@Override
	public String toString() {
		return String.format("책ID: %d, 책제목: %s, 책가격: %d, 출판사ID: %d", bookId, bookTitle, price, pubId);
	}
}