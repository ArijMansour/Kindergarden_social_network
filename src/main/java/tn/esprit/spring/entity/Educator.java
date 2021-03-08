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
import javax.persistence.Table;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.Courses;
@Entity 
@Table(name="T_Educator")
public class Educator extends User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Educator_ID")
	private Long Educator_Id ; 
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Courses> l_Courses;
}
