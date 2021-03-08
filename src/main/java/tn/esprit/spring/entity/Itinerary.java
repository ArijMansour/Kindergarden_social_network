package tn.esprit.spring.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="T_Itinarary")
public class Itinerary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Itinarary_ID")
	
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
