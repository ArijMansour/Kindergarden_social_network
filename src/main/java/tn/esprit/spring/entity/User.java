package tn.esprit.spring.entity;
import java.io.Serializable;

import java.util.* ;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import tn.esprit.spring.entity.Claims;
@Entity 
@Table(name="T_User")
public class User implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_ID")
	
	private Long User_Id ; 
	private String User_Email ;
	private String User_Password ;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Claims> l_Claims ; 
}
