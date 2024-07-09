package com.tjoeun.springBootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tjoeun.springBootJPA.domain.MemberHistory;

public interface MemberHistoryRepository extends JpaRepository<MemberHistory, Long> {
	
	
}
