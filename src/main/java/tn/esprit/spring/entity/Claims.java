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
@Table(name="T_Claims")
public class Claims implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Claims_ID")
	private Long Claims_Id ; 
	private String Claims_Description ; 
	private Date Claims_Date ; 
	private String Claims_image ; 
	private String Claims_Type ; 
	
	
	
}
