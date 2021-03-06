package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated; 
public class Appointment implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Appoinment_Id ; 
	private Date  Appoinment_Date ; 
	private String  Appoinment_Subject ; 
	
	@Enumerated(EnumType.STRING ) 
	private Place_Appoinment  place_appoinment ; 
	private Type_Appoinment   type_appoinment ; 

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

}
