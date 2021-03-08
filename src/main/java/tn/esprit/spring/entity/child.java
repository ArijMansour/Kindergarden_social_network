package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.* ;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table; 
import tn.esprit.spring.entity.Parent;;
@Entity 
@Table(name="T_Child")
public class child  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Child_ID")
	private Long Child_ID ;
	private String Child_F_name ;
	private String Child_L_name ;
	private Date Child_Birth_Date ; 
	private String Child_Adresse ; 

	@ManyToOne(cascade = CascadeType.ALL)
	Parent  Parent_Fils;

}
