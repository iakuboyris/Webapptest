package jp.co.f1.spring.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.f1.spring.bms.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
	

}
