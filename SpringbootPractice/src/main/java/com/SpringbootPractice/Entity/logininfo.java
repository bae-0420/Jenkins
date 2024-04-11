// 클래스 이름은 DB테이블 이름과 일치하도록

package com.SpringbootPractice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data // Controller에서 Entity 객체로 데이터 접근가능. (@Getter, @Setter)
//@Getter는 데이터에 접근할 수 있도록 setId() 제공.


public class logininfo {
	
	@Id // primary key
	@Column(name="id")	// DB의 id컬럼을 ID로 사용
	private String ID;
	
	@Column(name="pw")
	private String PW;
}
