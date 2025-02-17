package com.tjoeun.springBootJPA.domain;

import java.time.LocalDateTime;

// @PrePersist, @PreUpdate 엔티티 이벤트 메소드로 실행하던 필드 초기화를
// 엔티티 리스너로 하기 위해 필드의 setter 메소드를 추상메소드로 가지는 
// 인터페이스를 선언한다.
// 인터페이스 이벤트 리스너를 사용할 엔티티 클래스에서 구현해서 사용한다.
public interface Auditable {
	
	//abstract public LocalDateTime getCreateAt();
	//LocalDateTime getUpdateAt();
	
	void setCreateAt(LocalDateTime createAt);
	void setUpdateAt(LocalDateTime updateAt);
}
