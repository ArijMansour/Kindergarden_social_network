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
@Table(name="T_Chat")
public class Chat implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Chat_ID")
	
	private Long Chat_Id ; 
	private String Chat_Text ; 
	private Date Chat_Date ; 
	

	public Chat() {
		// TODO Auto-generated constructor stub
	}

}
