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
import javax.persistence.OneToOne;
import javax.persistence.Table; 
import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Club;
import tn.esprit.spring.entity.child;
import tn.esprit.spring.entity.Activity;
@Entity 
@Table(name="T_Kindergarden")
public class Kindergarden implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Kindergarden_ID")
	
	private Long Kindergarden_Id ;
	private String Kindergarden_name ;
	private String kindergarden_adresse ; 
	private Long Kindergarden_phone ; 
	private String Kindergarden_Matricule_Fiscale ; 
	private Date Kindergarden_Date ; 
	private String Kindergarden_Email ; 

	@OneToMany(cascade = CascadeType.ALL)
	private Set <Appointment> l_Appointment ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Club> l_Club ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Event> l_Event ;
	@OneToMany(cascade = CascadeType.ALL)
	private Set< child> l_child ;
	@OneToMany(cascade = CascadeType.ALL)
	private Set< Activity> l_Activity;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Meeting> l_Meeting;
	@OneToOne 
	private Staff Staff ; 
	
}
