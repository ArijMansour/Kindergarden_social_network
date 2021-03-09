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

	public Long getEducator_Id() {
		return Educator_Id;
	}

	public void setEducator_Id(Long educator_Id) {
		Educator_Id = educator_Id;
	}

	public Set<Courses> getL_Courses() {
		return l_Courses;
	}

	public void setL_Courses(Set<Courses> l_Courses) {
		this.l_Courses = l_Courses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Educator_Id == null) ? 0 : Educator_Id.hashCode());
		result = prime * result + ((l_Courses == null) ? 0 : l_Courses.hashCode());
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
		Educator other = (Educator) obj;
		if (Educator_Id == null) {
			if (other.Educator_Id != null)
				return false;
		} else if (!Educator_Id.equals(other.Educator_Id))
			return false;
		if (l_Courses == null) {
			if (other.l_Courses != null)
				return false;
		} else if (!l_Courses.equals(other.l_Courses))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Educator [Educator_Id=" + Educator_Id + ", l_Courses=" + l_Courses + "]";
	}

	public Educator(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims, Long educator_Id,
			Set<Courses> l_Courses) {
		super(user_Id, user_Email, user_Password, l_Claims);
		Educator_Id = educator_Id;
		this.l_Courses = l_Courses;
	}

	public Educator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Educator(Long user_Id, String user_Email, String user_Password, Set<Claims> l_Claims) {
		super(user_Id, user_Email, user_Password, l_Claims);
		// TODO Auto-generated constructor stub
	}
	
	
}
