package com.tjoeun.springBootJPA.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

// Member 테이블에 입력 또는 수정된 히스토리를 저장할 엔티티 선언
@NoArgsConstructor
@Data
@Entity
@EntityListeners(value = { MemberHistoryListener.class })
public class MemberHistory implements Auditable{
	
	@Id
	@GeneratedValue
	private Long id;
	private Long userId; //Member 테이블에 입력 또는 수정된 user의 id
	private String name;
	private String email;
	private LocalDateTime createAt;
	private LocalDateTime updateAt;
	
}
