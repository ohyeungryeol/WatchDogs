package kr.watchdogs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

// ORM(Object<-->Table)
@Entity
@Data
public class WD_Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx; // PK, 자동증가컬럼
	private String user_id;
	private String user_pw;
	private String user_name;
	@Column(columnDefinition = "int default 0")
	private int cnt;

}
