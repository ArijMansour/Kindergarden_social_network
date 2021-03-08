package tn.esprit.spring.entity;

import java.io.Serializable;

import java.util.* ;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table; 
@Entity 
@Table(name="T_Notification")
public class Notification implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Notification_ID")
	private Long Notification_Id ; 
	private Date Notification_Date ; 
	private String Notification_Text ; 
	private String Notification_Type ; 


	@ManyToMany(mappedBy="l_Notification", cascade = CascadeType.ALL)
	private Set <Parent> l_Parent_Notif ;


}
