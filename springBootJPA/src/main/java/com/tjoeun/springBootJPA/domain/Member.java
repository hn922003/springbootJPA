package com.tjoeun.springBootJPA.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor       // 기본 생성자를 만든다.
@AllArgsConstructor      // 모든 필드를 초기화 하는 생성자를 만든다.
@RequiredArgsConstructor // 특정(@NonNull 어노테이션을 붙여준) 필드를 초기화 하는 생성자를 만든다.
@Getter                  // 모든 필드의 getter 메소드를 만든다.
@Setter                  // 모든 필드의 setter 메소드를 만든다.
@ToString                // toString() 메소드를 Override 한다.
@EqualsAndHashCode       // equals() 메소드와 hashCode() 메소드를 Override 한다.
@Data                    // @Getter, @Setter, @ToString, @EqualsAndHashCode를 일괄 실행한다.
@Builder                 // 생성자를 대신해서 객체를 생성한다.
@Slf4j                   // 롬복이 지원하는 log를 출력할 때 사용한다.

//	클래스에 @Entity 어노테이션을 붙여주면 springBoot JPA가 클래스 이름으로 테이블을 만들고
//	테이블에 클래스의 필드 이름으로 필드를 만든다.
@Entity
@SequenceGenerator(
	name = "seq_generator", // 시퀀스 제네레이터 이름
	sequenceName = "member_id_seq", // 시퀀스 이름
	initialValue = 1, // 시퀀스 초기값
	allocationSize = 1 // 시퀀스 증가값
)
public class Member {

//	@Entity 어노테이션을 붙여준 클래스는 반드시 @Id 어노테이션과 @GeneratedValue 어노테이션으로
//	테이블의 기본키로 사용할 필드를 선언해야 한다.
//	@Id 어노테이션은 기본키로 사용할 필드에 붙여준다.
	@Id
//	@GeneratedValue 어노테이션은 기본키 값 증가 정책을 지정한다.
//	GenerationType.IDENTITY
//	mysql에 사용하며 기본키 생성을 데이터베이스에 위임한다. id 값은 자동으로 증가되며 입력된다.
//	GenerationType.SEQUENCE
//	oracle에 사용하며 유일한 값을 순서대로 생성하는 시퀀스를 사용해서 기본키를 생성한다.
//	GenerationType.TABLE
//	키 생성 전용 테이블을 생성하여 시퀀스 처럼 사용한다.
//	GenerationType.AUTO: 기본값, IDENTITY, SEQUENCE, TABLE 방식 중 하나를 JPA가 선택해서 적용한다.
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
	private Long id;
	
	@NonNull             // null 값을 허용하지 않는다.
	private String name;
	@NonNull
	private String email;
	private LocalDateTime createAt;
	private LocalDateTime updateAt;
	
}












