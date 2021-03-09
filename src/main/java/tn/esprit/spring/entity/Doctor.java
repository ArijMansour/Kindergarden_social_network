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

	public Long getDoctor_Id() {
		return Doctor_Id;
	}

	public void setDoctor_Id(Long doctor_Id) {
		Doctor_Id = doctor_Id;
	}

	public Set<Notes> getL_Notes() {
		return l_Notes;
	}

	public void setL_Notes(Set<Notes> l_Notes) {
		this.l_Notes = l_Notes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Doctor_Id == null) ? 0 : Doctor_Id.hashCode());
		result = prime * result + ((l_Notes == null) ? 0 : l_Notes.hashCode());
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
		Doctor other = (Doctor) obj;
		if (Doctor_Id == null) {
			if (other.Doctor_Id != null)
				return false;
		} else if (!Doctor_Id.equals(other.Doctor_Id))
			return false;
		if (l_Notes == null) {
			if (other.l_Notes != null)
				return false;
		} else if (!l_Notes.equals(other.l_Notes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [Doctor_Id=" + Doctor_Id + ", l_Notes=" + l_Notes + "]";
	}

	public Doctor(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims, Long doctor_Id,
			Set<Notes> l_Notes) {
		super(user_Id, user_Email, user_Password, l_Claims);
		Doctor_Id = doctor_Id;
		this.l_Notes = l_Notes;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims) {
		super(user_Id, user_Email, user_Password, l_Claims);
		// TODO Auto-generated constructor stub
	} 
	
	
}
