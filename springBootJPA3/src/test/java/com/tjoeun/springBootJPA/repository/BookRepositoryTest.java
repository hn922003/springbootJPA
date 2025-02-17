package com.tjoeun.springBootJPA.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tjoeun.springBootJPA.domain.Book;
@SpringBootTest
class BookRepositoryTest {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	void test() {
		System.out.println("BookRepositoryTest 클래스의 test() 메소드");
		System.out.println("<<<<<@prePersist 이벤트 메소드>>>>>");
		Book book = new Book();
		book.setName("간지나는 SpringBoot 책");
		book.setAuthor("홍길동");
		bookRepository.save(book); // insert
		
		List<Book> books = bookRepository.findAll();
		books.forEach(System.out::println);
		System.out.println("=================================================================================");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("<<<<<@preUpdate 이벤트 메소드>>>>>");
		book = bookRepository.findById(1L).orElse(null);
		book.setAuthor("임꺽정");
		bookRepository.save(book); // update
		
		books = bookRepository.findAll();
		books.forEach(System.out::println);
		System.out.println("=================================================================================");
		
		
	}
	

}
