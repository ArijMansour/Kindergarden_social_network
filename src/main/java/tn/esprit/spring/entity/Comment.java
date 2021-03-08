package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.* ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity 
@Table(name="T_Comment")
public class Comment implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Comment_ID")
	
	private Long Comment_Id ; 
	private Date Comment_Date ; 
	private String Comment_text ; 

	
}
