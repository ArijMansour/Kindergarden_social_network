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
	public Long getBusDriver_Id() {
		return BusDriver_Id;
	}
	public void setBusDriver_Id(Long busDriver_Id) {
		BusDriver_Id = busDriver_Id;
	}
	public Set<Itinerary> getL_Itinerary() {
		return l_Itinerary;
	}
	public void setL_Itinerary(Set<Itinerary> l_Itinerary) {
		this.l_Itinerary = l_Itinerary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((BusDriver_Id == null) ? 0 : BusDriver_Id.hashCode());
		result = prime * result + ((l_Itinerary == null) ? 0 : l_Itinerary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusDriver other = (BusDriver) obj;
		if (BusDriver_Id == null) {
			if (other.BusDriver_Id != null)
				return false;
		} else if (!BusDriver_Id.equals(other.BusDriver_Id))
			return false;
		if (l_Itinerary == null) {
			if (other.l_Itinerary != null)
				return false;
		} else if (!l_Itinerary.equals(other.l_Itinerary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BusDriver [BusDriver_Id=" + BusDriver_Id + ", l_Itinerary=" + l_Itinerary + "]";
	}
	public BusDriver(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims, Long busDriver_Id,
			Set<Itinerary> l_Itinerary) {
		super(user_Id, user_Email, user_Password, l_Claims);
		BusDriver_Id = busDriver_Id;
		this.l_Itinerary = l_Itinerary;
	}
	public BusDriver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusDriver(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims) {
		super(user_Id, user_Email, user_Password, l_Claims);
		// TODO Auto-generated constructor stub
	} 
	
	
}
