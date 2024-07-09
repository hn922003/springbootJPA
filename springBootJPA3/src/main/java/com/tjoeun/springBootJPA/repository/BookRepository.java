package com.tjoeun.springBootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjoeun.springBootJPA.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
