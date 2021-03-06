package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.* ; 

public class Notification implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Notification_Id ; 
	private Date Notification_Date ; 
	private String Notification_Text ; 
	private String Notification_Type ; 


	public Notification() {
		// TODO Auto-generated constructor stub
	}

}
