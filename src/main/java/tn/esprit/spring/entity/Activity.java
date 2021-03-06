package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.* ; 

public class Activity implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Activity_Id ; 
	private String Activity_Name ; 
	private String Activity_Type ; 
	private Date Activity_Date_Begin ; 
	private Date Activity_Date_Finish ;
	private String Activity_Description ; 
	private String Activity_Image ; 

	public Activity() {
		// TODO Auto-generated constructor stub
	}

}
