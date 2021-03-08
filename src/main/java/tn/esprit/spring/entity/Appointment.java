package tn.esprit.spring.entity;

import java.io.Serializable;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity 
@Table(name="T_Appointment")
public class Appointment implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Appointment_ID")
	private Long Appoinment_Id ; 
	private Date  Appoinment_Date ; 
	private String  Appoinment_Subject ; 
	
	@Enumerated(EnumType.STRING ) 
	private Place_Appoinment  place_appoinment ; 
	private Type_Appoinment   type_appoinment ; 

	

}
