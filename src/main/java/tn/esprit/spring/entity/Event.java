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
@Table(name="T_Event")
public class Event implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Event_ID")
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
