package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.Notes;
@Entity 
@Table(name="T_Doctor")
public class Doctor extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Doctor_ID")
	private Long Doctor_Id ; 
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Notes> l_Notes ; 
}
