package com.tjoeun.springBootJPA.domain;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.tjoeun.springBootJPA.repository.MemberHistoryRepository;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
public class MemberHistoryListener {
	// 엔티티 이벤트 리스너(MemberHistoryListener) 클래스는 
	// @Autowired에 의해서 자동으로 Bean을 주입받지 못한다.
	@Autowired
	private MemberHistoryRepository memberHistoryRepository;
	//MemberHistoryRepository memberHistoryRepository = BeanUtils.Bean(MemberHistoryRepository);
	
	// 두가지 중첩도 가능 insert / update 실행 전 실행
	@PrePersist
	@PreUpdate
	public void prePersistAndPreUpdate(Object object) {
		System.out.println("=============히스토리 엔티티 이벤트리스너의 prePersistAndPreUpdate 메소드 실행==============");
		System.out.println("오토와이어드 안됌.....ㅠㅠㅠㅠㅠ =>  " + memberHistoryRepository);
		
		/*
		if (object instanceof Auditable) {
			((Auditable) object).setCreateAt(LocalDateTime.now());
			((Auditable) object).setUpdateAt(LocalDateTime.now());
		}
		*/
	}

}
