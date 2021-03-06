package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.* ;

import javax.persistence.EnumType;
import javax.persistence.Enumerated; 

public class Club implements Serializable   {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Club_Id ; 
	private String Club_Description ; 
	@Enumerated(EnumType.STRING ) 
	private Type_Club type_club ; 

	public Club() {
		// TODO Auto-generated constructor stub
	}

}
