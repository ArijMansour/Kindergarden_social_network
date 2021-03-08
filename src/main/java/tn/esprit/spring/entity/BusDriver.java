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
import tn.esprit.spring.entity.Itinerary;
@Entity 
@Table(name="T_BusDriver")
public class BusDriver extends User implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BusDriver_ID")

	private Long BusDriver_Id ; 
	@OneToMany(cascade = CascadeType.ALL)
	private Set <Itinerary> l_Itinerary ; 
}
