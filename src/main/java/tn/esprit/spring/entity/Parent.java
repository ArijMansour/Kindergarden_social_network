package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.Chat;
import tn.esprit.spring.entity.Satisfaction;
import tn.esprit.spring.entity.Forum;
import tn.esprit.spring.entity.Notification;

@Entity 
@Table(name="T_Parent")
public class Parent extends User implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Parent_ID")
	
	private Long Parent_Id ; 
	private String Parent_First_name ;
	private String  Parent_Last_name ;
	private String  Parent_Adresse ; 
	private String  Parent_Telephone ; 
	private String  Parent_Cin ; 
	private String  Parent_Date ; 
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Chat> l_Chat ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Satisfaction> l_Satisfaction ; 
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Forum> l_Forum;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Notification> l_Notification;
	
	
}

