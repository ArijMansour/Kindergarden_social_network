package tn.esprit.spring.entity;

import java.io.Serializable;

import java.util.* ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="T_Notes")
public class Notes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Notes_ID")
	private Long Note_Id ;
	private Date Note_Creation_Date ;
	private String Note_Description ; 
	
	 @Enumerated(EnumType.STRING ) 
	 private Subject_note subject_note ;
	 private Type_Note type_note ; 
	 

}
