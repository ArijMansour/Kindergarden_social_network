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
@Table(name="T_Club")
public class Club implements Serializable   {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Club_ID")
	
	private Long Club_Id ; 
	private String Club_Description ; 
	@Enumerated(EnumType.STRING ) 
	private Type_Club type_club ; 

	

}
