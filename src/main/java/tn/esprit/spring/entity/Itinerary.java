package tn.esprit.spring.entity;
import java.io.Serializable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
public class Itinerary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long Itinarary_Id ; 
	private String Itinarary_Bus_Ref ; 
	private int Itinarary_Place_Number ;
    @Enumerated(EnumType.STRING ) 
    private From from ; 
    private To to ; 
    
	public Itinerary() {
		// TODO Auto-generated constructor stub
	}

}
