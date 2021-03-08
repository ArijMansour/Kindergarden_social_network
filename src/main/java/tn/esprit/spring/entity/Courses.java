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
import tn.esprit.spring.entity.Educator;;
@Entity 
@Table(name="T_Courses")
public class Courses implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Courses_ID")
	private Long Courses_ID ; 
	private String Courses_name ; 
	private String Courses_Details ; 
	private String[] Students = new String [100] ;  
	
	
	@ManyToMany(mappedBy="l_Courses", cascade = CascadeType.ALL)
	private Set <Educator> l_Educator;
	
}
