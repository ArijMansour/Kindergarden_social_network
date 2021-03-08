package tn.esprit.spring.entity;

import tn.esprit.spring.entity.User;
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
@Table(name="T_Staff")
public class Staff  extends  User  implements Serializable{

	
	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Staff_ID")
	private Long Staff_Id ; 
	private String Staff_First_name ;
	private String  Staff_Last_name ;
	private String  Staff_Adresse ; 
	private String  Staff_Telephone ; 
	private String  Staff_Cin ; 
	private String  Staff_Date ; 
	
	@Enumerated(EnumType.STRING ) 
	private Role role ; 
	

}

