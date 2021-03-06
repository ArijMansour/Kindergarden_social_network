package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.* ;

import javax.persistence.EnumType;
import javax.persistence.Enumerated; 

public class Event implements Serializable{
	
	private Long Event_Id ;
	private Date Event_Date_Begin ; 
	private Date Event_Date_Finish ; 
	private String Event_Description ;
	
	@Enumerated(EnumType.STRING ) 
	private Place_Event place_event ; 
	private Type_Event  type_event ; 

	public Event() {
		// TODO Auto-generated constructor stub
	}

}
