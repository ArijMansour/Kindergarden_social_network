package tn.esprit.spring.entity;

import tn.esprit.spring.entity.*;
import java.io.Serializable;
import java.util.* ;

import javax.persistence.EnumType;
import javax.persistence.Enumerated; 

public class Staff  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	private String First_Name ; 
	private String Last_Name ; 
	private String Phone_Number ; 
	private String Adresse ; 
	@Enumerated(EnumType.STRING ) 
	private Role role ; 
	public Staff() {
		// TODO Auto-generated constructor stub
	}

}
