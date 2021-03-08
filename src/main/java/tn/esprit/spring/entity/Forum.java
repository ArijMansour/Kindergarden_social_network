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
import tn.esprit.spring.entity.Parent;
@Entity 
@Table(name="T_Forum")
public class Forum implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Forum_ID")
	private Long Forum_Id; 
	private String Forum_Subject ; 
	private Date Forum_Date_Creation ; 
	

	@ManyToMany(mappedBy="l_Forum", cascade = CascadeType.ALL)
	private Set <Parent> l_Parent_Forum;

}
