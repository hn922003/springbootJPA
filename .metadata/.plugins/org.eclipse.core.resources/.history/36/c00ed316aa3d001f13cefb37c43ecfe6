package com.tjoeun.springBootJPA.domain;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

// 엔티티 이벤트 리스너를 만든다.
public class MyEntityListener {

	// 엔티티 이벤트 리스너는 여러 엔티티에서 사용될 수 있으므로 @PrePersist, @PreUpdate 를
	// 붙여서 엔티티 이벤트를 처리하는 메소드를 만든다.
	
	// 엔티티 이벤트 리스너에는 인터페이스(Auditable)가 구현된 엔티티 객체가 자동으로 넘어온다.
	// 엔티티 이벤트 리스너가 실행될 때 넘어오는 엔티티 객체가 달라질 수 있기 때문에 
	// 모든 객체를 처리가능하도록 Object 클래스 타입의 인수를 지정해 사용한다.
	@PrePersist
	public void prePersist(Object object) {
		System.out.println("=============마이엔티티 이벤트리스너의 insert 전 실행하는 메소드 실행==============");
		// prePersist() 메소드의 인수로 넘어온 객체가 인터페이스(Auditable)로 형변환이 되며느
		// 엔티티 이벤트 리스너를 사용하는 엔티티 객체이므로 작성일과 수정일을 저장한다.
		//System.out.println("넘어오는 객체의 클래스? => " + object.getClass()); //class com.tjoeun.springBootJPA.domain.Member
		if (object instanceof Auditable) {
			((Auditable) object).setCreateAt(LocalDateTime.now());
			((Auditable) object).setUpdateAt(LocalDateTime.now());
		}
	}
	
	@PreUpdate
	public void preUpdate(Object object) {
		System.out.println("=============마이엔티티 이벤트리스너의 update 전 실행하는 메소드 실행==============");
		if (object instanceof Auditable) {
			((Auditable) object).setUpdateAt(LocalDateTime.now());
		}
	}
}
