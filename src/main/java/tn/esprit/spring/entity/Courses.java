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


	public Long getCourses_ID() {
		return Courses_ID;
	}


	public void setCourses_ID(Long courses_ID) {
		Courses_ID = courses_ID;
	}


	public String getCourses_name() {
		return Courses_name;
	}


	public void setCourses_name(String courses_name) {
		Courses_name = courses_name;
	}


	public String getCourses_Details() {
		return Courses_Details;
	}


	public void setCourses_Details(String courses_Details) {
		Courses_Details = courses_Details;
	}


	public String[] getStudents() {
		return Students;
	}


	public void setStudents(String[] students) {
		Students = students;
	}


	public Set<Educator> getL_Educator() {
		return l_Educator;
	}


	public void setL_Educator(Set<Educator> l_Educator) {
		this.l_Educator = l_Educator;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Courses_Details == null) ? 0 : Courses_Details.hashCode());
		result = prime * result + ((Courses_ID == null) ? 0 : Courses_ID.hashCode());
		result = prime * result + ((Courses_name == null) ? 0 : Courses_name.hashCode());
		result = prime * result + Arrays.hashCode(Students);
		result = prime * result + ((l_Educator == null) ? 0 : l_Educator.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		if (Courses_Details == null) {
			if (other.Courses_Details != null)
				return false;
		} else if (!Courses_Details.equals(other.Courses_Details))
			return false;
		if (Courses_ID == null) {
			if (other.Courses_ID != null)
				return false;
		} else if (!Courses_ID.equals(other.Courses_ID))
			return false;
		if (Courses_name == null) {
			if (other.Courses_name != null)
				return false;
		} else if (!Courses_name.equals(other.Courses_name))
			return false;
		if (!Arrays.equals(Students, other.Students))
			return false;
		if (l_Educator == null) {
			if (other.l_Educator != null)
				return false;
		} else if (!l_Educator.equals(other.l_Educator))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Courses [Courses_ID=" + Courses_ID + ", Courses_name=" + Courses_name + ", Courses_Details="
				+ Courses_Details + ", Students=" + Arrays.toString(Students) + ", l_Educator=" + l_Educator + "]";
	}


	public Courses(Long courses_ID, String courses_name, String courses_Details, String[] students,
			Set<Educator> l_Educator) {
		super();
		Courses_ID = courses_ID;
		Courses_name = courses_name;
		Courses_Details = courses_Details;
		Students = students;
		this.l_Educator = l_Educator;
	}


	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
