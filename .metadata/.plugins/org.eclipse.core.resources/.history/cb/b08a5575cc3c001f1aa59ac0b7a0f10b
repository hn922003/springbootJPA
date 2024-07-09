-- 더미 데이터만 입력하고 프로그램에서는 데이터를 입력하지 않는 경우에는 아래와 같이 insert sql 명령을
-- 실행하면 GenerationType이 IDENTITY, SEQUENCE, TABLE, AUTO 중 어느것으로 설정되어 있어도 상관없다.
-- insert into member(id, name, email, create_at, update_at) values (1, '홍길동', 'hong@tjoeun.com', now(), now());
-- insert into member(id, name, email, create_at, update_at) values (2, '임꺽정', 'lim@tjoeun.com', now(), now());
-- insert into member(id, name, email, create_at, update_at) values (3, '장길산', 'jang@tjoeun.com', now(), now());
-- insert into member(id, name, email, create_at, update_at) values (4, '일지매', 'il@tjoeun.com', now(), now());
-- insert into member(id, name, email, create_at, update_at) values (5, '홍길동', 'gildong@tjoeun.com', now(), now());
-- insert into member(id, name, email, create_at, update_at) values (6, '홍길동', 'hong@tjoeun.com', now(), now());

-- 입력된 더미 데이터 뒤에 프로그램에서 데이터를 입력할 경우에는 기본키 값 증가 정책에 따라 더미 데이터의
-- 코딩 방법이 달라진다.

-- GenerationType이 IDENTITY일 경우
-- 기본키 값이 자동으로 1씩 증가하는 auto_increment가 사용되므로 id는 값을 입력하지 않는다.
-- insert into member(name, email, create_at, update_at) values ('홍길동', 'hong@tjoeun.com', now(), now());
-- insert into member(name, email, create_at, update_at) values ('임꺽정', 'lim@tjoeun.com', now(), now());
-- insert into member(name, email, create_at, update_at) values ('장길산', 'jang@tjoeun.com', now(), now());
-- insert into member(name, email, create_at, update_at) values ('일지매', 'il@tjoeun.com', now(), now());
-- insert into member(name, email, create_at, update_at) values ('홍길동', 'gildong@tjoeun.com', now(), now());
-- insert into member(name, email, create_at, update_at) values ('홍길동', 'hong@tjoeun.com', now(), now());

-- GenerationType이 SEQUENCE일 경우
-- Entity 클래스에서 @SequenceGenerator 어노테이션을 사용해서 sequence 이름, 초기값, 증값을 설정해야 한다.
insert into member(id, name, email, create_at) values (nextval('member_id_seq'), '홍길동', 'hong@tjoeun.com', now());
insert into member(id, name, email, create_at, update_at) values (nextval('member_id_seq'), '임꺽정', 'lim@tjoeun.com', now(), now());
insert into member(id, name, email, create_at, update_at) values (nextval('member_id_seq'), '장길산', 'jang@tjoeun.com', now(), now());
insert into member(id, name, email, create_at, update_at) values (nextval('member_id_seq'), '일지매', 'il@tjoeun.com', now(), now());
insert into member(id, name, email, create_at, update_at) values (nextval('member_id_seq'), '홍길동', 'gildong@tjoeun.com', now(), now());
insert into member(id, name, email, create_at, update_at) values (nextval('member_id_seq'), '홍길동', 'hong@tjoeun.com', now(), now());
