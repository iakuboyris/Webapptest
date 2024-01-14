package jp.co.f1.spring.bms.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="bookinfo")
public class Book {
	//ISBN
	@Id
	@Column(length = 20)
	@NotEmpty(message="ISBNを入力してください")
	private String isbn;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	} 
	
	//タイトル
	@Column(length = 100, nullable = true)
	@NotEmpty(message="タイトルを入力してください")
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	} 
	//価格
		@Column(length = 11, nullable = true)
		@NotEmpty(message="価格を入力してください")
		private String price;
		
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		} 

}
